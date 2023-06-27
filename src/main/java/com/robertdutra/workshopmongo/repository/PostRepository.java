package com.robertdutra.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.robertdutra.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
