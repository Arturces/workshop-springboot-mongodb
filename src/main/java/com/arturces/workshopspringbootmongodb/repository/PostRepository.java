package com.arturces.workshopspringbootmongodb.repository;

import com.arturces.workshopspringbootmongodb.domain.Post;
import com.arturces.workshopspringbootmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
