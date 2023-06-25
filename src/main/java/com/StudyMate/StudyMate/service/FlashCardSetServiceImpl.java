package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.dto.FlashCardSetResponse;
import com.StudyMate.StudyMate.model.FlashCardSet;
import com.StudyMate.StudyMate.repository.FlashcardRepository;
import com.StudyMate.StudyMate.repository.FlashcardSetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO: adding more security measurement to only allow same user to add flashcard and flashcard set to their account
 */
@Service
public class FlashCardSetServiceImpl implements FlashCardSetService {
    private final FlashcardSetRepository flashcardSetRepository;
    private final FlashcardRepository flashcardRepository;

    public FlashCardSetServiceImpl(FlashcardSetRepository flashcardSetRepository, FlashcardRepository flashcardRepository) {
        this.flashcardSetRepository = flashcardSetRepository;
        this.flashcardRepository = flashcardRepository;
    }


    @Override
    public List<FlashCardSetResponse> getAllSets(long userId) {
        List<FlashCardSet> flashCardSets = flashcardSetRepository.findFlashCardSetById(userId);
        return flashCardSets.stream()
                .map(flashCardSet ->
                        new FlashCardSetResponse(flashCardSet.getId(), flashCardSet.getName(), flashCardSet.getDescription(), flashcardRepository.countAllById(flashCardSet.getUserID())))
                .toList();
    }

    @Override
    public void save(FlashCardSet flashCardSet) {
        flashcardSetRepository.save(flashCardSet);
    }


    @Override
    public void delete(long setId) {
        flashcardSetRepository.deleteById(setId);
    }
}
