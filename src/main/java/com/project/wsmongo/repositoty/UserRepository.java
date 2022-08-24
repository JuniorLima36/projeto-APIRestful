package com.project.wsmongo.repositoty;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.wsmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}