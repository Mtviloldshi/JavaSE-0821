package com.ambiton.project;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/16:12
 * @Description:
 *  模拟客户端
 */
public class UserClient {
    static UserDao userDao = new UserDaoImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("-----------0821高级系统----------\n");
            System.out.println("            1.登录");
            System.out.println("            2.注册");
            System.out.println("            3.退出");
            System.out.println("请选择：");
            String no = scanner.nextLine();

            switch (no){
                case "1":
                    System.out.println("-----------登陆界面------------------");
                    System.out.println("请输入用户名：");
                    String nameing = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String pwding = scanner.nextLine();
                    boolean login = userDao.login(nameing, pwding);
                    if (login) {
                        System.out.println("登录成功！");
                    } else {
                        System.out.println("登陆失败！");
                    }
                    break;
                case "2":
                    System.out.println("-----------注册界面------------------");
                    System.out.println("请输入用户名：");
                    String name = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String pwd = scanner.nextLine();

                    //判断是否注册过
                    User user = userDao.getUserByName(name);
                    if (user != null){
                        System.out.println("用户已注册！");
                        break;
                    }
                    //封装user对象
                    user = new User(name,pwd);
                    //注册用户
                    userDao.regist(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                    System.out.println("-----------是否确认退出------------------");
                    exit = false;
                    break;
            }
        }while (exit);

    }


}
