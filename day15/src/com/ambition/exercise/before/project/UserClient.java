package com.ambition.exercise.before.project;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/11:18
 * @Description:
 * 设计用户客户端类UserClient，实现登录界面输入输出功能
 * 使用数组对象实现注册用户数据的存储
 * 改进设计增加用户数据操作接口UserDao和实现类UserDaoImpl，
 * 实现登录注册功能的数据访问操作。
 */
public class UserClient {
//    实例化键盘输入对象
    private static Scanner scanner = new Scanner(System.in);
    //实例化UserDao对象
    private static UserDaoImp userDao = new UserDaoImp();
    public static void main(String[] args) {
        boolean isExit = true;
        String userName = null;
        String password = null;
        do {
            System.out.println("-------------------用户管理系统----------------------\n");
            System.out.println("                        1.登录");
            System.out.println("                        2.注册");
            System.out.println("                        3.退出\n");
            System.out.print("请选择(1-3):");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("\n---------------------登录界面--------------------");
                    //获取输入的用户名密码
                    userName = getUserName();
                    password = getPassword();
                    //调用登录方法 判断登录是否成功
                    if (userDao.login(userName,password)){
                        System.out.println("登陆成功");
                        break;
                    }
                    System.out.println("登陆失败,用户名或密码错误");
                    break;
                case 2:
                    System.out.println("\n---------------------注册界面--------------------");
                    //获取输入的用户名密码
                    userName = getUserName();
                    //调用判断是否存在重复用和方法，判断用户是否存在
                    if (userDao.isRegistered(userName)){
                        System.out.println("注册失败,用户名已存在");
                        break;
                    }
                    password = getPassword();
                    //调用注册方法，判断是否成功
                    if (userDao.registered(userName,password)){
                        System.out.println("注册成功");
                        break;
                    }
                    System.out.println("注册失败");
                    break;
                case 3:
                    System.out.println("\n---------------------退出--------------------");
                    isExit = false;
                    break;
            }

        } while (isExit);
    }

    //疯转键盘就收用户名密码方法
    public static String getUserName(){
        System.out.print("请输入用户名：");
        String username = scanner.next();
        return username;
    }
    public static String getPassword(){
        System.out.print("请输入密码：");
        String password = scanner.next();
        return password;
    }
}
