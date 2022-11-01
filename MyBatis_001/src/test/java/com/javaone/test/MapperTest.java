package com.javaone.test;

import com.javaone.mapper.UserMapper;
import com.javaone.pojo.User;
import com.javaone.service.Login;
import com.javaone.service.impl.LoginImpl;
import com.javaone.util.GetMyBatis;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MapperTest {

    @Test
    public void testServiceLogin(){
        Login login = new LoginImpl();
        Boolean login1 = login.login("郝文韬", "123456789");
        System.out.println(login1);
    }

    @Test
    public void testInsertUser() throws Exception {
        UserMapper mapper = (UserMapper) GetMyBatis.getClass(UserMapper.class);
        User user = new User();
        user.setUName("难得避世桃源");
        user.setUPwd("123456");
        user.setUEmail("123456@qq.com");
        int i = mapper.insertUser(user);
        System.out.println(i > 0 ? "注册成功" : "注册失败");
    }
    @Test
    public void testGetUserByNameAndPwd() throws Exception {
        UserMapper mapper = (UserMapper)GetMyBatis.getClass(UserMapper.class);
        User user = new User();
        user.setUName("郝文韬");
        user.setUPwd("123456789");
        List<User> users = mapper.getUserByCondition(user);
        System.out.println(users.size()>0 ? "登陆成功":"登录失败");
    }

    @Test
    public void testMyBatis() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        users.forEach(System.out::println);
    }
}
