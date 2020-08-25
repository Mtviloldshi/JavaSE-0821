package com.ambition.demo;

import java.util.Scanner;

//键盘录入
public class Demo2 {
    public static void main(String[] args) {
        //键盘录入步骤
        //1.创建一个键盘扫描器，扫描键盘录入的数据
        java.util.Scanner scanner = new java.util.Scanner(System.in);//scanner是一个变量名
        //2.提示信息
        System.out.println("请输入一个整数：");
        //3.扫描键盘录入
        int num = scanner.nextInt();
        System.out.println("您输入的是：" + num);
    }
}
