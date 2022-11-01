package com.javaone.mapper;

import com.javaone.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 全查
     * @return  返回List
     */
    List<User> selectUser();
}
