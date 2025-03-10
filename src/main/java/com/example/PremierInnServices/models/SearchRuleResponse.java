package com.example.PremierInnServices.models;

public class SearchRuleResponse {

    private SearchRule data;

    public SearchRuleResponse(SearchRule data) {
        this.data = data;
    }

    public SearchRule getData() {
        return data;
    }

    public void setData(SearchRule data) {
        this.data = data;
    }
}
