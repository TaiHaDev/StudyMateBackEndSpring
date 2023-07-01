package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.Quotes;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quotes, Integer> {
    List<Quotes> getQuotesById(int quotesId);
}
