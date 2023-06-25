package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FlashCardSet;
import com.StudyMate.StudyMate.service.FavouriteBackgroundService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/favouriteBackground")
public class FavouriteBackgroundController {
    private final FavouriteBackgroundService favouriteBackgroundService;


    public FavouriteBackgroundController(FavouriteBackgroundService favouriteBackgroundService) {
        this.favouriteBackgroundService = favouriteBackgroundService;
    }

    @GetMapping("/{userId}")
    public List<Background> getFavouriteBackgroundByUserId(@PathVariable int userId) {
        return favouriteBackgroundService.getFavouriteBackgroundByUserId(userId);
    }
}
