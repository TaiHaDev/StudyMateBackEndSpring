package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.service.UserAuthenticationService;
import com.StudyMate.StudyMate.serviceImpl.UserAuthenticationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    UserAuthenticationService userAuthenticationService;

    public AuthenticationController(UserAuthenticationService userAuthenticationService) {
        this.userAuthenticationService = userAuthenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        if (userAuthenticationService.createAccount(user)) {
            return ResponseEntity.ok("Successfully registered");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email existed");
        }
    }


}
