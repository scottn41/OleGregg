package com.olegregg.repository;

import com.olegregg.domain.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<ToDo, String> {

    public ToDo findByGuid(String guid);

}
