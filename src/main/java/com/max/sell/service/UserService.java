package com.max.sell.service;

import com.max.sell.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    List<HashMap<Object,Object>> findAll();
    List<User> test();
}
