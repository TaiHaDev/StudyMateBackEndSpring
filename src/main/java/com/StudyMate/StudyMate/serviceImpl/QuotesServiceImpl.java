package com.StudyMate.StudyMate.serviceImpl;


import com.StudyMate.StudyMate.model.Quotes;
import com.StudyMate.StudyMate.repository.QuotesRepository;
import com.StudyMate.StudyMate.service.QuotesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesServiceImpl implements QuotesService {
    private final QuotesRepository quotesRepository;

    public QuotesServiceImpl(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    @Override
    public List<Quotes> getQuotesById(int quotesId){
        return quotesRepository.getQuotesById(quotesId);
    }

    @Override
    public void delete(int quotesId){
        quotesRepository.deleteById(quotesId);
    }

    @Override
    public void save(Quotes quotes){
        quotesRepository.save(quotes);
    }
}
