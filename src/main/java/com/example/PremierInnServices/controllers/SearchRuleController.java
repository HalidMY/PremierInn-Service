package com.example.PremierInnServices.controllers;


import com.example.PremierInnServices.models.SearchRule;
import com.example.PremierInnServices.models.SearchRuleResponse;
import com.example.PremierInnServices.services.SearchRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/searchRules")
public class SearchRuleController {

    @Autowired
    private SearchRuleService searchRuleService;

    @GetMapping("/{id}")
    public SearchRuleResponse getSearchRuleById(@PathVariable String id) {
        SearchRule rule = searchRuleService.getSearchRuleById(id);
        return new SearchRuleResponse(rule);
    }

    @PostMapping
    public SearchRuleResponse createSearchRule(@RequestBody SearchRule rule) {
        SearchRule savedRule = searchRuleService.createSearchRule(rule);
        return new SearchRuleResponse(savedRule);
    }

    @PutMapping
    public SearchRuleResponse updateSearchRule(@RequestBody SearchRule rule) {
        SearchRule updatedRule = searchRuleService.updateSearchRule(rule);
        return new SearchRuleResponse(updatedRule);
    }

    @DeleteMapping
    public void deleteSearchRule(@RequestBody SearchRule rule) {
        searchRuleService.deleteSearchRule(rule);
    }


}
