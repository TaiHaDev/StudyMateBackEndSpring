package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.FlashCardSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlashcardSetRepository extends JpaRepository<FlashCardSet, Long> {
    List<FlashCardSet> findFlashCardSetById(long id);
}
