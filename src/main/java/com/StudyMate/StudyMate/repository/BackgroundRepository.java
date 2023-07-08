package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.Background;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BackgroundRepository extends JpaRepository<Background, Long> {
    List<Background> getBackgroundByTheme(String themeName);

    Background getBackgroundById(int id);
}
