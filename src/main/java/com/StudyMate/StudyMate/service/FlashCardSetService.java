package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.dto.FlashCardSetResponse;
import com.StudyMate.StudyMate.model.FlashCardSet;

import java.util.List;

public interface FlashCardSetService {
    /**
     * Get all the flashcard set of the current user
     * @param userId current user id
     * @return all flash card sets of the current user
     */
    List<FlashCardSetResponse> getAllSets(long userId);
    /**
     *
     * @param flashCardSet
     */
    void save(FlashCardSet flashCardSet);
    /**
     *
     * @param setId
     */
    void delete(long setId);
}
