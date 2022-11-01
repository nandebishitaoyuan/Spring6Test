package com.javaone.spring.test;

import com.javaone.bean.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringBean {
    @Test
    public void testSpringBeans() throws Exception {
        Logger logger = LoggerFactory.getLogger(User.class);
        logger.info("我是一条日志消息");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        /*if (user instanceof User){
            User user1 = (User) user;
            user1.s();
        }*/
        user.s();
    }
}
