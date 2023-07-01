package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.User;

import java.util.List;

public interface UserService {
    List<User> getBackgroundByUserId(int userId);

    void delete(int userId);

    void save(User user);
}
