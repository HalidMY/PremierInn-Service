package com.example.PremierInnServices.graphql;

import com.example.PremierInnServices.models.SearchRule;
import com.example.PremierInnServices.services.SearchRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchRuleQueryResolver {

    @Autowired
    private SearchRuleService searchRuleService;

    @QueryMapping
    public List<SearchRule> getAllSearchRules() {
        return searchRuleService.getAllSearchRules();
    }

    @QueryMapping
    public SearchRule searchRuleById(@Argument String id) {
        return searchRuleService.getSearchRuleById(id);
    }
}
