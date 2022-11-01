package com.javaone.mapper;

import com.javaone.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
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

    /**
     * 通过id删除用户
     * @param id
     * @return 返回删除的个数
     */
    int deleteUser(@Param("uid") Integer id);

    /**
     * 修改用户信息
     * @param user
     * @return 返回修改的条数
     */
    int updateUser(@Param("user") User user);
}
