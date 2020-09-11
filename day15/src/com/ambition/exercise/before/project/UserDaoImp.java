package com.ambition.exercise.before.project;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/11:32
 * @Description:
 * 使用数组对象实现注册用户数据的存储
 *
 * 封装数据
 */
public class UserDaoImp implements UserDao{
    private User[] users = new User[5];

    //注册存储用户
    public boolean registered(String username,String password){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null){
                User user = new User(username,password);
                users[i] = user;
                return true;
            }
        }
        return false;
    }

    //用户登录
    public boolean login(String username,String password){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                if (username.equals(users[i].getUserName()) && password.equals(users[i].getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    //判断是否有相同用户存在，如果没有返回账户 如果有返回false，如果没有返回nulltrue
    public boolean isRegistered(String username){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                if (username.equals(users[i].getUserName())){
                    return true;
                }
            }
        }
        return false;
    }
}
