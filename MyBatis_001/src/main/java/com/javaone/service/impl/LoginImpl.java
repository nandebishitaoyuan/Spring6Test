package com.javaone.service.impl;

import com.javaone.mapper.UserMapper;
import com.javaone.pojo.User;
import com.javaone.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class LoginImpl implements Login {

    @Override
    public Boolean login(String username, String password) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper mapper = applicationContext.getBean("userMapper", UserMapper.class);
        User user = applicationContext.getBean("user", User.class);
        user.setuName(username);
        user.setuPwd(password);
        List<User> userList = mapper.getUserByCondition(user);
        return userList != null && userList.size() > 0;
    }
}
