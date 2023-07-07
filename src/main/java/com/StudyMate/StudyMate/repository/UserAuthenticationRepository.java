package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserAuthenticationRepository extends CrudRepository<User, Integer> {
    User findUserByEmail(String email);
}
