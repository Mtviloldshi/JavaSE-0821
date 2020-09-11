package com.ambition.exercise.before.project;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/12:33
 * @Description:
 */
public interface UserDao {
    boolean login(String username,String password);
    boolean registered(String username,String password);
    boolean isRegistered(String username);
}
