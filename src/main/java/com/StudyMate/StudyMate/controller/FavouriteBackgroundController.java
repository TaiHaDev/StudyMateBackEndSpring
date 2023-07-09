package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.dto.FavouriteBackgroundRequest;
import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;
import com.StudyMate.StudyMate.model.FlashCardSet;
import com.StudyMate.StudyMate.service.FavouriteBackgroundService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favouriteBackground")
public class FavouriteBackgroundController {
    private final FavouriteBackgroundService favouriteBackgroundService;


    public FavouriteBackgroundController(FavouriteBackgroundService favouriteBackgroundService) {
        this.favouriteBackgroundService = favouriteBackgroundService;
    }

    @GetMapping("/{userId}")
    public List<FavouriteBackground> getFavouriteBackgroundByUserId(@PathVariable int userId) {
        return favouriteBackgroundService.getFavouriteBackgroundByUserId(userId);
    }
    @PostMapping("/add")
    public void addNewFavouriteBackground(@RequestBody FavouriteBackgroundRequest favouriteBackground) {
        favouriteBackgroundService.save(favouriteBackground);
    }

    @DeleteMapping("/delete/{userId}/{favoriteBackgroundId}")
    public void deleteFavouriteBackgroundById(@PathVariable int userId ,@PathVariable int favoriteBackgroundId) {
        favouriteBackgroundService.deleteFavouriteBackgroundByUserIdAndBackgroundId(userId,favoriteBackgroundId);
    }
}
