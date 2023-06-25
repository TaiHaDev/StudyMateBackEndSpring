package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getBackgroundByUserId(long userId) {
        return userRepository.getBackgroundById(userId);
    }

    @Override
    public void delete(long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
