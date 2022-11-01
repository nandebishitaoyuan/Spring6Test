package com.javaone.pojo;

import lombok.Data;

@Data
public class User {
    //用户id
    private Integer uId;
    //用户名
    private String uName;
    //密码
    private String uPwd;
    //邮箱
    private String uEmail;

    public User() {
    }

    public User(Integer uId, String uName, String uPwd, String uEmail) {
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uEmail = uEmail;
    }
}
