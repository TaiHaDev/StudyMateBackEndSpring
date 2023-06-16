package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Background;

import java.util.List;

public interface BackgroundService {
    List<Background> getBackgroundByTheme(String themeName);
    void delete(long backgroundId);
    void save(Background background);
}
