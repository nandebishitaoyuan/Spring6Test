package com.javaone.mapper;

import com.javaone.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 全查
     * @return  返回List
     */
    List<User> selectUser();

    /**
     * 通过条件获取用户
     * @param user
     * @return 返回获取到的用户的List集合
     */
    List<User> getUserByCondition(@Param("user") User user);

    /**
     * 传一个用户对象将他添加到数据库中
     * @param user
     * @return 返回添加的条数
     */
    int insertUser(@Param("user") User user);
}
