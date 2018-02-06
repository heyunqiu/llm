package com.llm.domain.user.repository;

import com.llm.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by hyq on 2018/2/5.
 */
public interface UserRepository extends MongoRepository<User, String>{
    User findByAccount(String account);
}
