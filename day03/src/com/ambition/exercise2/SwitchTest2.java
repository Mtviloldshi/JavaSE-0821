package com.ambition.exercise2;

import java.util.Scanner;

/*
## 第二题
语法点：变量，运算符，if和switch...case

    题目：已知2019年1月1日是星期二，从键盘输入2019年的任意一天，请判断它是星期几
        改版：输入年份 月份 日期，求出当天是星期几
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        int days = 0, monthDay = 0, week = 2;//初始化总天数，每个月天数和，星期 天数
        if (year > 0) {
            System.out.println("请输入月份：");
            int month = scan.nextInt();
            if (month > 0 && month < 13) {
                switch (month) {
                    case 12:
                        monthDay += 31;
                    case 11:
                        monthDay += 31;
                    case 10:
                        monthDay += 31;
                    case 9:
                        monthDay += 30;
                    case 8:
                        monthDay += 31;
                    case 7:
                        monthDay += 31;
                    case 6:
                        monthDay += 30;
                    case 5:
                        monthDay += 31;
                    case 4:
                        monthDay += 30;
                    case 3:
                        monthDay += 31;
                    case 2:
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            monthDay += 29;
                        } else {
                            monthDay += 28;
                        }
                    case 1:
                        monthDay += 31;
                        //如果是当前月份，就减去当前月份的天数
                        if (month == 2) {
                            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                                monthDay -= 29;
                            }else{
                                monthDay -= 28;
                            }
                        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                            monthDay -= 30;
                        } else {
                            monthDay -= 31;
                        }
                        break;

                }
                System.out.println("请输入月份第几天：");
                int day = scan.nextInt();
                days = monthDay + day;//总天数
                week = days % 7 + 2;//取模7 加上周二，得出当前星期数
                System.out.println("总天数：" + days + "星期：" + week);
            } else {
                System.out.println("输入月份有误！");
            }
        } else {
            System.out.println("输入年份有误！");
        }

    }
}
