package com.ambiton.project;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/16:35
 * @Description:
 *
 *  用户数据操作类
 */
public class UserDaoImpl implements UserDao{
    private static User[] users = new User[5];//模拟数据库

    //登录
    public  boolean login(String name,String password){
        boolean success = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (name.equals(users[i].getUserName()) && password.equals(users[i].getPassword())) {
                    success = true;
                    break;
                }
            }
        }
        return success;
    }

    //注册
    public void regist(User user){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null){
                users[i] = user;
                break;
            }
        }
    }

    /**
     * 根据用户名获取用户对象
     * @param name
     * @return
     */
    public User getUserByName(String name){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
                if (users[i].getUserName().equals(name)){
                    return users[i];
                }
            }
        }
        return null;
    }
}
