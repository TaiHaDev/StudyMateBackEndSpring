package com.StudyMate.StudyMate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {



    @PostMapping("/register")
    public ResponseEntity<String> registerUser() {

    }
}
