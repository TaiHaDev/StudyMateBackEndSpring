package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.repository.BackgroundRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BackgroundServiceImpl implements BackgroundService {
    private final BackgroundRepository backgroundRepository;

    public BackgroundServiceImpl(BackgroundRepository backgroundRepository) {
        this.backgroundRepository = backgroundRepository;
    }

    @Override
    public List<Background> getBackgroundByTheme(String themeName) {
        return backgroundRepository.getBackgroundByTheme(themeName);

    }

    @Override
    public void delete(long backgroundId) {
        backgroundRepository.deleteById(backgroundId);
    }

    @Override
    public void save(Background background) {
        backgroundRepository.save(background);
    }
}
