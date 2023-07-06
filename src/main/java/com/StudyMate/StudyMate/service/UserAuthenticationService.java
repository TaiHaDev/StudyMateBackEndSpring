package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.User;

public interface UserAuthenticationService {
    boolean emailExist(String email);
    boolean createAccount(User user);
    boolean login(User user);
}
