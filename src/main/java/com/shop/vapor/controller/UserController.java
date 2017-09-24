package com.shop.vapor.controller;

import com.shop.vapor.persistance.entity.User;
import com.shop.vapor.service.UserService;
import com.shop.vapor.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public  @ResponseBody List<User> getAll(){
        return userService.findAll();
    }

}
