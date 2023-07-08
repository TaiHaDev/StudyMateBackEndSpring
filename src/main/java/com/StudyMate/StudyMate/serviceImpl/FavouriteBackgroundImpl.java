package com.StudyMate.StudyMate.serviceImpl;

import com.StudyMate.StudyMate.dto.FavouriteBackgroundRequest;
import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;
import com.StudyMate.StudyMate.model.User;
import com.StudyMate.StudyMate.repository.BackgroundRepository;
import com.StudyMate.StudyMate.repository.FavouriteBackgroundRepository;
import com.StudyMate.StudyMate.repository.UserRepository;
import com.StudyMate.StudyMate.service.FavouriteBackgroundService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteBackgroundImpl implements FavouriteBackgroundService {
    private final FavouriteBackgroundRepository favouriteBackgroundRepository;
    private final UserRepository userRepository;
    private final BackgroundRepository backgroundRepository;


    public FavouriteBackgroundImpl(FavouriteBackgroundRepository favouriteBackgroundRepository, UserRepository userRepository, BackgroundRepository backgroundRepository) {
        this.favouriteBackgroundRepository = favouriteBackgroundRepository;
        this.userRepository = userRepository;
        this.backgroundRepository = backgroundRepository;
    }

    @Override
    public void save(FavouriteBackgroundRequest favouriteBackground) {
        FavouriteBackground fb = new FavouriteBackground();
        User user = userRepository.getBackgroundById(favouriteBackground.userID()).get(0);
        Background bg = backgroundRepository.getBackgroundById(favouriteBackground.backgroundID());
        fb.setUser(user);
        fb.setBackground(bg);
        favouriteBackgroundRepository.save(fb);
    }

    @Override
    public void delete(long userId) {
        favouriteBackgroundRepository.deleteById(userId);
    }

    @Override
    public List<FavouriteBackground> getFavouriteBackgroundByUserId(int userId) {
        return favouriteBackgroundRepository.getFavouriteBackgroundByUserId(userId);
    }

    @Override
    public void deleteFavouriteBackgroundByUserIdAndBackgroundId(int userId, long backgroundId) {
        favouriteBackgroundRepository.deleteByUserIdAndBackgroundId(userId, backgroundId);
    }

}
