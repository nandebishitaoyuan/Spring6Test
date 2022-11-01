package com.javaone.service.impl;

import com.javaone.mapper.UserMapper;
import com.javaone.pojo.User;
import com.javaone.service.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class RegisterImpl implements Register {

    @Override
    public Boolean register(String username, String password, String email) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper mapper = applicationContext.getBean("userMapper", UserMapper.class);
        User user = applicationContext.getBean("user", User.class);
        user.setuName(username);
        user.setuPwd(password);
        user.setuEmail(email);
        int i = mapper.insertUser(user);
        return i > 0;
    }
}
