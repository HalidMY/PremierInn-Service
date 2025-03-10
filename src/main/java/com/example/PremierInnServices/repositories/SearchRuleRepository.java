package com.example.PremierInnServices.repositories;

import com.example.PremierInnServices.models.SearchRule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRuleRepository extends MongoRepository<SearchRule, String> {
}
