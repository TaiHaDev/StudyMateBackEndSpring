package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;
import com.StudyMate.StudyMate.repository.FavouriteBackgroundRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteBackgroundImpl implements FavouriteBackgroundService {
    private final FavouriteBackgroundRepository favouriteBackgroundRepository;


    public FavouriteBackgroundImpl(FavouriteBackgroundRepository favouriteBackgroundRepository) {
        this.favouriteBackgroundRepository = favouriteBackgroundRepository;
    }

    @Override
    public void save(FavouriteBackground favouriteBackground) {

    }

    @Override
    public void delete(long userId) {

    }

    @Override
    public List<Background> getFavouriteBackgroundByUserId(int userId) {

        return null;
    }

}
