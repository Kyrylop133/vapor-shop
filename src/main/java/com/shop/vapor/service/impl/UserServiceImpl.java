package com.shop.vapor.service.impl;

import com.shop.vapor.persistance.entity.User;
import com.shop.vapor.persistance.repository.UserRepository;
import com.shop.vapor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
