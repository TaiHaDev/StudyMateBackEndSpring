package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.FlashCardSet;
import com.StudyMate.StudyMate.repository.FlashcardSetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO: adding more security measurement to only allow same user to add flashcard and flashcard set to their account
 */
@Service
public class FlashCardSetServiceImpl implements FlashCardSetService{
    private final FlashcardSetRepository flashcardSetRepository;

    public FlashCardSetServiceImpl(FlashcardSetRepository flashcardSetRepository) {
        this.flashcardSetRepository = flashcardSetRepository;
    }

    /**
     * Get all the flashcard set of the current user
     * @param userId current user id
     * @return all flash card sets of the current user
     */
    @Override
    public List<FlashCardSet> getAllSets(long userId) {
        return flashcardSetRepository.findFlashCardSetById(userId);
    }

    /**
     *
     * @param flashCardSet
     */
    @Override
    public void save(FlashCardSet flashCardSet) {
        flashcardSetRepository.save(flashCardSet);
    }

    /**
     *
     * @param setId
     */
    @Override
    public void delete(long setId) {
        flashcardSetRepository.deleteById(setId);
    }
}
