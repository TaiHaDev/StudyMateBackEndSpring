package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.FlashCardSet;

import java.util.List;

public interface FlashCardSetService {
    List<FlashCardSet> getAllSets(long userId);
    void save(FlashCardSet flashCardSet);
    void delete(long setId);
}
