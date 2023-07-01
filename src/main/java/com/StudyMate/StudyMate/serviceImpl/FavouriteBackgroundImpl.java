package com.StudyMate.StudyMate.serviceImpl;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;
import com.StudyMate.StudyMate.repository.FavouriteBackgroundRepository;
import com.StudyMate.StudyMate.service.FavouriteBackgroundService;
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
        favouriteBackgroundRepository.save(favouriteBackground);
    }

    @Override
    public void delete(long userId) {
        favouriteBackgroundRepository.deleteById(userId);
    }

    @Override
    public List<FavouriteBackground> getFavouriteBackgroundByUserId(int userId) {
        return favouriteBackgroundRepository.getFavouriteBackgroundByUserId(userId);
    }

}
