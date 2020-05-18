package com.max.sell.controller;

import com.max.sell.entity.User;
import com.max.sell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/api/account")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public List<User> test1(){
        return userService.findAllUsers();
    }

    @RequestMapping("/test2")
    public List<HashMap<Object,Object>> test2(){
        return userService.findAll();
    }

    @RequestMapping("/test3")
    public List<User> test3(){
        return userService.test();
    }
}
