package com.ambition.exercise3;

import java.util.Scanner;

/*
    第11题：这一天是当年的第几天
 */
public class ThisDayIsThisYearManyDayExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入日期：");
        int day = scan.nextInt();
        int days = 0;
        for (int i = 1; i < month; i++) {
            if (i == 2){
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    days += 29;
                }else {
                    days += 28;
                }
            }else if (i == 4 || i == 6 || i == 9 || i == 11){
                days += 30;
            }else {
                day += 31;
            }
        }
        //增强版
//        if (year > 0) {
//            if (month > 0 && month < 13) {
//                if (day > 0 && day < 32) {
//                    for (int i = 1; i < month; i++) {
//                        if (i == 2) {
//                            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//                                days += 29;
//                            } else days += 28;
//                        } else if (i == 4 || i == 6 || i == 9 || i == 11) {
//                            day += 30;
//                        } else {
//                            day += 31;
//                        }
//                    }
//                } else {
//                    System.out.println("输入日期有误！");
//                }
//            } else {
//                System.out.println("输入月份有误！");
//            }
//        } else {
//            System.out.println("输入年份有误！");
//        }

        days += day;
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第：" + days + "天");
    }
}
