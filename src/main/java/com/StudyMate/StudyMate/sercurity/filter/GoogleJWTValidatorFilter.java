package com.StudyMate.StudyMate.sercurity.filter;

import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.repository.UserAuthenticationRepository;
import com.StudyMate.StudyMate.sercurity.GoogleTokenVerifierService;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Security;
import java.util.logging.Logger;


public class GoogleJWTValidatorFilter extends OncePerRequestFilter {
    private final Logger LOG = Logger.getLogger(GoogleJWTValidatorFilter.class.getName());
    GoogleTokenVerifierService tokenVerifierService;
    UserAuthenticationRepository userAuthenticationRepository;


    public GoogleJWTValidatorFilter(GoogleTokenVerifierService tokenVerifierService, UserAuthenticationRepository userAuthenticationRepository) {
        this.tokenVerifierService = tokenVerifierService;
        this.userAuthenticationRepository = userAuthenticationRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String googleJwt = request.getHeader("google");
        if (googleJwt != null) {
            try {
                GoogleIdToken.Payload verify = tokenVerifierService.verify(googleJwt);
                String userEmail = verify.getEmail();
                User user = userAuthenticationRepository.findUserByEmail(userEmail);
                if (user != null) {
                    Authentication auth = new UsernamePasswordAuthenticationToken(user.getEmail(), null,
                            user.getAuthorities());
                    SecurityContextHolder.getContext().setAuthentication(auth);
                    logger.info("Successfully logged in with google jwt token");
                }

            } catch (GeneralSecurityException e) {
                logger.info("Invalid google jwt token");
                throw new RuntimeException(e);
            }
        }
        filterChain.doFilter(request, response);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return !request.getServletPath().equals("/authenticate");
    }
}
