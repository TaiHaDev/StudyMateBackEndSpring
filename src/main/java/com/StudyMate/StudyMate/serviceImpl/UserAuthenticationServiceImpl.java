package com.StudyMate.StudyMate.serviceImpl;

import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.repository.UserAuthenticationRepository;
import com.StudyMate.StudyMate.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {


    UserAuthenticationRepository userAuthenticationRepository;
    PasswordEncoder passwordEncoder;
    @Autowired
    public UserAuthenticationServiceImpl(UserAuthenticationRepository userAuthenticationRepository, PasswordEncoder passwordEncoder) {
        this.userAuthenticationRepository = userAuthenticationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserAuthenticationServiceImpl(UserAuthenticationRepository userAuthenticationRepository) {
        this.userAuthenticationRepository = userAuthenticationRepository;
    }
    @Override
    public User getUserDetails(String email) {
        return userAuthenticationRepository.findUserByEmail(email);
    }

    @Override
    public boolean emailExist(String email) {
        return userAuthenticationRepository.findUserByEmail(email) != null;
    }

    @Override
    public boolean createAccount(User user) {
        if (!emailExist(user.getEmail())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userAuthenticationRepository.save(user).getId() > 0;
        }
        return false;
    }

    @Override
    public boolean login(User user) {
        return false;
    }
}
