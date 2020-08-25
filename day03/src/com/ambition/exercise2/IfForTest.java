package com.ambition.exercise2;

import java.util.Scanner;

/*
    ## 第五题
    语法点：运算符，for，if
    案例需求：从键盘分别输入年、月、日，使用循环for+if实现，判断这一天是当年的第几天
 */
public class IfForTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = scan.nextInt();
        System.out.println("请输入月：");
        int month = scan.nextInt();
        System.out.println("请输入日：");
        int day = scan.nextInt();
        int days = 0, monthDay = 0;
        for (int i = 1; i < month + 1; i++) {//循环垒加此月份之前的每月天数
            if (i == 3) {//判断是否是闰年，且用i+1代表当前的月份
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    monthDay += 29;
                } else {
                    monthDay += 28;
                }
            } else if (i == 5 || i == 7 || i == 10 || i == 12) {
                monthDay += 30;
            } else if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11 || i == 13){
                monthDay += 31;
            }
        }
        days = day + monthDay;//总天数
        System.out.println(year + "年" + month + "月" + day + "日" +
                "是这一年的第" + days);
    }
}
