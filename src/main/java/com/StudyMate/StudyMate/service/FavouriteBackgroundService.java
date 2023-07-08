package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.dto.FavouriteBackgroundRequest;
import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;

import java.util.List;

public interface FavouriteBackgroundService {
    List<FavouriteBackground> getFavouriteBackgroundByUserId(int userId);

    void save(FavouriteBackgroundRequest favouriteBackground);

    void delete(long favouriteBackgroundId);


    void deleteFavouriteBackgroundByUserIdAndBackgroundId(int userId, long backgroundId);
}
