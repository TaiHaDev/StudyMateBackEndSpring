package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.dto.FlashCardDTO;
import com.StudyMate.StudyMate.model.FlashCard;
import com.StudyMate.StudyMate.repository.FlashcardRepository;

public class FlashCardServiceImpl implements  FlashCardService{
    private final FlashcardRepository flashcardRepository;

    public FlashCardServiceImpl(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    @Override
    public void updateFlashcard(FlashCardDTO flashCard) {
        flashcardRepository.save(new FlashCard(flashCard.id(), flashCard.front(), flashCard.back()));
    }

    @Override
    public void getAllFlashCardsBySetId(int flashCardSetId) {

    }
}
