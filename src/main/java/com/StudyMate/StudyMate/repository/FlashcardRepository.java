package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.FlashCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlashcardRepository extends JpaRepository<FlashCard, Long> {
    int countAllById(int id);
}
