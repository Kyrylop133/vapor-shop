package com.shop.vapor.persistance.repository;

import com.shop.vapor.persistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByEmail(String email);
}
