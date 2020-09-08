package com.ambition.exceptions;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/16:34
 * @Description: Test
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input name：");
        String username = scanner.nextLine();
//        System.out.println("please input password：");
//        String password = scanner.nextLine();
        try {
            userExist(username);
        }catch (UserException e){
            System.out.println(e.getMessage());
        }
        System.out.println("程序结束！");



    }

    public static boolean userExist(String name){
        String[] arr = {"aaa","jack","tom"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)){
                return true;
            }
        }
        throw new UserExistException("用户名不存在");
    }
}
