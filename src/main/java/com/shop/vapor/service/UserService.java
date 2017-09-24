package com.shop.vapor.service;

import com.shop.vapor.persistance.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
     List<User> findAll();
}
