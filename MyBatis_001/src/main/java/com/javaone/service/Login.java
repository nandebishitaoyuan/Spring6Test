package com.javaone.service;



public interface Login {

    /**
     * 通过用户名和密码登录
     * @param username
     * @param password
     * @return Boolean
     */
    Boolean login(String username, String password);

}
