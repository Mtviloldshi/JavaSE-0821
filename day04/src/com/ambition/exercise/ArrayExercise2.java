package com.ambition.exercise;

import java.util.Scanner;

/*
    练习3：用一个数组存储本组学员的姓名，从键盘输入，并遍历显示
 */
public class ArrayExercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //初始化数组长度
        String[] names = new String[4];
        //循环接收数据
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学的姓名：");
            names[i] = scan.next();
        }
        //循环输出数据
        for (int i = 0; i < names.length; i++) {
            System.out.println("第" + (i + 1) + "位同学的姓名是：" + names[i]);
        }
    }
}
