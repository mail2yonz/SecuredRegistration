package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    Long countByEmail(String email);

    Long countByUsername(String username);
}