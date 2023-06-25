package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.dto.FlashCardSetResponse;
import com.StudyMate.StudyMate.service.FlashCardSetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flashcardSet")
public class FlashCardSetController {
    private final FlashCardSetService flashCardSetService;

    public FlashCardSetController(FlashCardSetService flashCardSetService) {
        this.flashCardSetService = flashCardSetService;
    }


    @GetMapping("/{userId}")
    public List<FlashCardSetResponse> getFlashCardByUserId(@PathVariable Long userId) {
        return flashCardSetService.getAllSets(userId);
    }

}
