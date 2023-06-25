package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.Background;
import com.StudyMate.StudyMate.model.FavouriteBackground;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavouriteBackgroundRepository extends JpaRepository<FavouriteBackground, Long> {
    List<FavouriteBackground> getFavouriteBackgroundByUserId(int userId);
}
