package com.marlon.coursemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marlon.coursemongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
