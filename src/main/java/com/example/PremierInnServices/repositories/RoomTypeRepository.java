package com.example.PremierInnServices.repositories;

import com.example.PremierInnServices.models.RoomType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends MongoRepository<RoomType, String> {
}
