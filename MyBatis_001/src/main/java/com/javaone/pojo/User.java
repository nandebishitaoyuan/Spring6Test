package com.javaone.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
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

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uEmail='" + uEmail + '\'' +
                '}';
    }
}
