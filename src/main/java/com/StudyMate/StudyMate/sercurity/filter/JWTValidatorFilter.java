package com.StudyMate.StudyMate.sercurity.filter;

import com.StudyMate.StudyMate.constants.SMConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class JWTValidatorFilter extends OncePerRequestFilter {
    private final Logger LOG = Logger.getLogger(JWTValidatorFilter.class.getName());

    /**
     * Validate the jwt tokens from the request header and only carry on to the next filter if the token is valid
     * @param request
     * @param response
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String jwt = request.getHeader(SMConstants.JWT_HEADER);
        if (jwt != null) {
            try {
                SecretKey key = Keys.hmacShaKeyFor(SMConstants.JWT_KEY.getBytes(StandardCharsets.UTF_8));
                Claims claims = Jwts.parserBuilder()
                        .setSigningKey(key)
                        .build()
                        .parseClaimsJws(jwt)
                        .getBody();
                String email = String.valueOf(claims.get("username"));
                String authorities = String.valueOf(claims.get("authorities"));
                Authentication auth = new UsernamePasswordAuthenticationToken(email, null,
                        AuthorityUtils.commaSeparatedStringToAuthorityList(authorities));
                SecurityContextHolder.getContext().setAuthentication(auth);
                LOG.info("successfully validate JWT tokens");

            } catch (Exception e) {
                LOG.info("INVALID JWT Tokens");
                throw new BadCredentialsException(e.getMessage());
            }
        }
        filterChain.doFilter(request, response);

    }

    /**
     * Only filter the token when the servlet path is not login
     */
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return request.getServletPath().equals("/authenticate");
    }
}
