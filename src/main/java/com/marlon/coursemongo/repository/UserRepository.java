package com.marlon.coursemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marlon.coursemongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
