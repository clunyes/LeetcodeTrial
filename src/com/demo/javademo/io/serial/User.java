package com.demo.javademo.io.serial;

import java.io.Serializable;

public class User implements Serializable {
    public User(String u, String p, String s) {
        this.userName = u;
        this.password = p;
        this.sex = s;
    }

    private String userName;
    private String password;
    private String sex;
    //全参构造方法、get和set方法省略


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
