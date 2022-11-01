package com.javaone.service.impl;

import com.javaone.mapper.UserMapper;
import com.javaone.pojo.User;
import com.javaone.service.Login;
import com.javaone.util.GetMyBatis;
import org.springframework.stereotype.Service;

import java.util.List;

public class LoginImpl implements Login {
    @Override
    public Boolean login(String username, String password) {
        UserMapper mapper = (UserMapper)GetMyBatis.getClass(UserMapper.class);
        User user = new User(null, username, password, null);
        List<User> userList = mapper.getUserByCondition(user);
        return userList != null && userList.size() > 0;
    }
}
