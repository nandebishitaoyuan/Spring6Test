package com.javaone.service.impl;

import com.javaone.mapper.UserMapper;
import com.javaone.pojo.User;
import com.javaone.service.Register;
import com.javaone.util.GetMyBatis;

public class RegisterImpl implements Register {
    @Override
    public Boolean register(String username, String password, String email) {
        UserMapper mapper = (UserMapper)GetMyBatis.getClass(UserMapper.class);
        User user = new User(null, username, password, email);
        int i = mapper.insertUser(user);
        return i > 0;
    }
}
