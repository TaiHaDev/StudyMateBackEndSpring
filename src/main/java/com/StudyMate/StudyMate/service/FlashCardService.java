package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.dto.FlashCardDTO;

public interface FlashCardService {
    void updateFlashcard(FlashCardDTO flashCard);
    void getAllFlashCardsBySetId(int flashCardSetId);
}
