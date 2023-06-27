package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.FlashCardSet;
import com.StudyMate.StudyMate.service.FlashCardSetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flashcardSet")
public class FlashCardController {
    private final FlashCardSetService flashCardSetService;

    public FlashCardController(FlashCardSetService flashCardSetService) {
        this.flashCardSetService = flashCardSetService;
    }


    @GetMapping("/{userId}")
    public List<FlashCardSet> getFlashCardByUserId(@PathVariable Long userId) {
        return flashCardSetService.getAllSets(userId);
    }




}
