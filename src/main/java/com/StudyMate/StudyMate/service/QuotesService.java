package com.StudyMate.StudyMate.service;

import com.StudyMate.StudyMate.model.Quotes;

import java.util.List;

public interface QuotesService {
    List<Quotes> getQuotesById(int quotesId);

    void delete(int quotesId);

    void save(Quotes quotes);

}
