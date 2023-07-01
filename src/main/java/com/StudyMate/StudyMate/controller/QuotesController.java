package com.StudyMate.StudyMate.controller;

import com.StudyMate.StudyMate.model.Quotes;
import com.StudyMate.StudyMate.service.QuotesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuotesController {
    private final QuotesService quotesService;

    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @GetMapping("/{quotesId}")
    public List<Quotes> getQuotesById (@PathVariable int quotesId){
        return quotesService.getQuotesById(quotesId);
    }

    @PostMapping("/save")
    public void addNewQuotes(@RequestBody Quotes quote){
        quotesService.save(quote);
    }

    @DeleteMapping("/delete/{quotesId}")
    public void deleteQuotesById(@PathVariable Integer quotesId){
        quotesService.delete(quotesId);
    }
}
