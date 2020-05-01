package com.learning.SpringProject.repository;

import com.learning.SpringProject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
