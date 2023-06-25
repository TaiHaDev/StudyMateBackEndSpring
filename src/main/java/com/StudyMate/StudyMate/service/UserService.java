package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.User;

import java.util.List;

public interface UserService {
    List<User> getBackgroundByUserId(long userId);

    void delete(long userId);

    void save(User user);
}
