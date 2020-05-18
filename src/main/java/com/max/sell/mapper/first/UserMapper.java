package com.max.sell.mapper.first;

import com.max.sell.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();
    List<HashMap<Object,Object>> findAll();
}
