package com.javaone.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetMyBatis {
    public static Object getClass(Class<?> clazz){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            return sqlSessionFactory.openSession(true).getMapper(clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
