package com.ambition.exercise.before.project;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/11:17
 * @Description:
 * 设计用户类User，封装用户数据
 */
public class User {
    private String userName;

    public User() {
    }

    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

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
}
