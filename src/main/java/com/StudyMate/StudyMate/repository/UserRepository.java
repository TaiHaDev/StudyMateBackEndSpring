package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> getBackgroundById(long userId);
}
