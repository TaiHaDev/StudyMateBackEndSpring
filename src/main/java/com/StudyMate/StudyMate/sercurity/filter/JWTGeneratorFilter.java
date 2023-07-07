package com.StudyMate.StudyMate.sercurity.filter;

import com.StudyMate.StudyMate.constants.SMConstants;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.logging.Logger;

public class JWTGeneratorFilter extends OncePerRequestFilter {
    private final Logger LOG = Logger.getLogger(JWTGeneratorFilter.class.getName());
    /**
     * Generating the new JWT tokens from the user details and sign it with a generated key
     * @param request
     * @param response
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            SecretKey key = Keys.hmacShaKeyFor(SMConstants.JWT_KEY.getBytes(StandardCharsets.UTF_8));
            String jwt = Jwts.builder().setIssuer("StudyMate").setSubject("JWT Token")
                    .claim("username", authentication.getName())
                    .claim("authorities", authentication.getAuthorities())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(new Date().getTime() + 3000000))
                    .signWith(key).compact();
            response.setHeader(SMConstants.JWT_HEADER, jwt);
            LOG.info("successfully created JWT token");
        }
        filterChain.doFilter(request, response);
    }

    /**
     * only generate the JWT token when user logged in successfully
     * @param request current HTTP request
     * @return
     * @throws ServletException
     */
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return !request.getServletPath().equals("/authenticate");
    }
}
