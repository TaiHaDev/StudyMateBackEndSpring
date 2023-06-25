package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Background;

import java.util.List;

public interface BackgroundService {
    /**
     * Search for backgrounds by theme name from the get request
     * @param themeName (ie. animal, public, coffee)
     * @return a list of backgrounds
     */
    List<Background> getBackgroundByTheme(String themeName);

    /**
     *
     * @param backgroundId
     */
    void delete(long backgroundId);

    /**
     *
     * @param background
     */
    void save(Background background);

    void getFavouriteBackgroundByUserId(int userId);
}
