package com.ambition.demo;

import java.util.Scanner;

//if嵌套的使用
//课堂练习：从键盘输入一个年份，和月份，输出该年份该月的总天数
//要求：年份为正数，月份1-12
public class Demo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        int day;
        if (year > 0) {
            System.out.println("请输入月份：");
            int month = scan.nextInt();
            if (month > 0 && month < 13) {
                if (month == 2) {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {//是否为闰年
                        day = 29;
                    } else {
                        day = 28;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    day = 30;
                } else {
                    day = 31;
                }
                System.out.println(year + "年" + month + "月" + "有" + day + "天");
            } else {
                System.out.println("输入月份有误！");
            }
        } else {
            System.out.println("输入年份有误！");
        }
    }
}
