package com.javaone.test;

import com.javaone.mapper.UserMapper;
import com.javaone.pojo.User;
import com.javaone.service.Login;
import com.javaone.service.Register;
import com.javaone.service.impl.LoginImpl;
import com.javaone.service.impl.RegisterImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MapperTest {

    @Test
    public void testUpdateUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper mapper = applicationContext.getBean("userMapper", UserMapper.class);
        User user = applicationContext.getBean("user", User.class);
        user.setuName("嘤嘤嘤");
        user.setuPwd("123");
        user.setuEmail("777@gmail.com");
        user.setuId(10005);
        int i = mapper.updateUser(user);
        System.out.println(i);
    }
    @Test
    public void testDeleteUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper mapper = applicationContext.getBean("userMapper", UserMapper.class);
        int i = mapper.deleteUser(10008);
        System.out.println(i);
    }

    @Test
    public void testSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.selectUser();
        User user = new User();
        user.setuName("郝文韬");
        user.setuPwd("123456789");
        List<User> userList = userMapper.getUserByCondition(user);
//        users.forEach(user -> System.out.println(user));
        userList.forEach(System.out::println);
    }
    @Test
    public void testServiceLogin(){
        Login login = new LoginImpl();
        Boolean login1 = login.login("郝文韬", "123456789");
        System.out.println(login1);
    }

    @Test
    public void testInsertUser() throws Exception {
        Register register = new RegisterImpl();
        Boolean 难得避世桃源 = register.register("难得避世桃源", "123456", "123456@qq.com");
        System.out.println(难得避世桃源 ? "注册成功" : "注册失败");
    }
    /*@Test
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
    }*/
}
