package com.StudyMate.StudyMate.repository;

import com.StudyMate.StudyMate.model.Quotes;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quotes, Integer> {
    List<Quotes> getQuotesById(int quotesId);
    @Query(nativeQuery = true, value = "SELECT * FROM quotes  ORDER BY RAND() LIMIT 1")
    Quotes getRandomQuote();
}
