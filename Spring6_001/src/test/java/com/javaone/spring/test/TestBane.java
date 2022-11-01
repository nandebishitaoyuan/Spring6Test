package com.javaone.spring.test;

import com.javaone.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestBane {


    private User user;
    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    @Test
    public void test(){
        user.s();
    }
}
