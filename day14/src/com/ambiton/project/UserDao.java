package com.ambiton.project;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/16:53
 * @Description:
 *
 * 用户数据操作接口
 */
public interface UserDao {
     boolean login(String name,String pwd);
     void regist(User user);
     User getUserByName(String name);
}
