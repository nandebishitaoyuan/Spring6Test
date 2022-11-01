package com.javaone.bean.test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FanSheTest {

    @Test
    public void testFanShe() throws Exception {
        /**
         * 通过反射机制调用该类中的方法
         */
        Class<?> clazz = Class.forName("com.javaone.bean.User");
        /**
         * clazz.newInstance();在JDK9之后已过时，不再建议使用
         */
//        Object o = clazz.newInstance();
        /**
         * 通过反射机制使用clazz.getDeclaredConstructor().newInstance();来调用该类的无参构造方法创建该对象
         */
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        Method age = clazz.getDeclaredMethod("setAge", int.class);
        Object invoke = age.invoke(o, 20);
        System.out.println(o);
    }
}
