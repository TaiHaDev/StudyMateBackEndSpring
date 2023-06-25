package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;

import java.util.List;

public interface FavouriteBackgroundService {

    List<Background> getAllBackgrounds(long userId);

    void save(FavouriteBackground favouriteBackground);

    void delete(long userId);

}
