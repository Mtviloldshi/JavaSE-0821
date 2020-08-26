package com.ambition.exercise;

import java.util.Scanner;

/*
    2. 练习2：用一个数组存储本组学员的年龄，从键盘输入，并遍历显示
 */
public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ages = new int[5];//初始化数组
        for (int i = 0; i < ages.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生年龄：");
            ages[i] = scan.nextInt();//循环存入数据
        }
        //取出数据
        for (int i = 0; i < ages.length; i++) {
            System.out.println("第" + (i+1) + "位同学年龄是:" + ages[i] + "岁");
        }
    }
}
