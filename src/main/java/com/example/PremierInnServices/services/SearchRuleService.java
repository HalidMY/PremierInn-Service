package com.example.PremierInnServices.services;


import com.example.PremierInnServices.models.SearchRule;
import com.example.PremierInnServices.repositories.SearchRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchRuleService {

    @Autowired
    private SearchRuleRepository searchRuleRepository;

    public List<SearchRule> getAllSearchRules() {
        return searchRuleRepository.findAll();
    }

    public SearchRule getSearchRuleById(String id) {
        return searchRuleRepository.findById(id).orElse(null);
    }

    public SearchRule createSearchRule(SearchRule searchRule) {
        return searchRuleRepository.save(searchRule);
    }

    public void deleteSearchRule(SearchRule searchRule) {
        searchRuleRepository.delete(searchRule);
    }

}
