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

}
