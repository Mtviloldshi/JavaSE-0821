package com.ambition.exercise;

import java.util.Scanner;

//1.键盘录入两个数据，获取这两个数据中的最大值（三目运算符）
public class exercise1 {
    public static void main(String[] args) {
        //1.创建扫描器
        Scanner scan = new Scanner(System.in);
        //2.提示输入
        System.out.println("请输入两个数据：");
        //3.接收数据
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //求最大值
        int max = num1 > num2 ? num1 : num2;
        System.out.println("两个数中的最大数是："  + max);
        System.out.println("程序结束！");
    }
}
