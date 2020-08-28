package com.ambition.exercise3;

import java.util.Scanner;

/*
    第3题：三个数排序
        3、编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else
            if-else),并且从小到大输出。
 */
public class ThreeNumberSortExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个数：");
        int num3 = scan.nextInt();
        if (num1 < num2 && num1 < num3){
            if (num2 < num3){
                System.out.println(num1 + " " + num2 + " " + num3);
            }else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }else if (num2 < num1 && num2 < num3){
            if (num1 < num3){
                System.out.println(num2 + " " + num1 + " " + num3);
            }else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }else {
            if (num1 < num2){
                System.out.println(num3 + " " + num1 + " " + num2);
            }else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
    }
}
