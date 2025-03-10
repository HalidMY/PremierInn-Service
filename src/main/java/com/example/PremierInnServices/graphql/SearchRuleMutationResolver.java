package com.example.PremierInnServices.graphql;

import com.example.PremierInnServices.graphql.dto.SearchRuleInput;
import com.example.PremierInnServices.models.SearchRule;
import com.example.PremierInnServices.services.SearchRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;


@Component
public class SearchRuleMutationResolver {

    @Autowired
    private SearchRuleService searchRuleService;

    @MutationMapping
    public SearchRule createSearchRule(@Argument("input") SearchRuleInput input) {
        SearchRule searchRule = new SearchRule(
                input.getMaxRoomsLimitation(),
                input.getMaxNightsLimitation(),
                input.getMaxArrivalDateLimitation(),
                input.getRoomOccupancyLimitations()
        );
        return searchRuleService.createSearchRule(searchRule);
    }
}

