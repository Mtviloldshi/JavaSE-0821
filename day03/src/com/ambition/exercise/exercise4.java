package com.ambition.exercise;

import java.util.Scanner;
//键盘录入个人信息
public class exercise4 {
    public static void main(String[] args) {
        //1.创建扫描器
        Scanner scan = new Scanner(System.in);
        //2.提是信息
        System.out.println("请输入姓名");
        //3.接收信息
        String name = scan.next();
        System.out.println("请输入年龄");
        int age = scan.nextInt();
        System.out.println("请输入性别");
        char gender = scan.next().charAt(0);
        System.out.println("请输入身高");
        double weight = scan.nextDouble();
        System.out.println("请输入简介");
        String profile = scan.next();

        //输出信息
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("性别：" + weight);
        System.out.println("简介：" + profile);
        System.out.println("程序结束!");
    }
}
