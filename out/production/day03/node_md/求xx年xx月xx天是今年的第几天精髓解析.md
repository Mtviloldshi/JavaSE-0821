```java
package com.ambition.exercise;

import java.util.Scanner;

/*
    练习6：从1990年1月1日开始，三天打鱼两天晒网，问某年某月某日是打鱼还是晒网
 */
public class ArrayExercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年：");
        int[] years = {365, 366};
        int year = scan.nextInt();
        int yearsDays = 0;
        //年份累加天数
        if (year > 1989) {//用输入的年份减去1990年年份循环输出年份总天数
            for (int i = 0; i < year - 1990; i++) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    yearsDays += years[1];//闰年
                } else {
                    yearsDays += years[0];
                }
            }
        } else {
            System.out.println("输入错误！");
        }
        
        System.out.println("请输入月：");
        int month = scan.nextInt();
        System.out.println("请输入日：");
        int day = scan.nextInt();
        int days = 0;
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            monthDay[1] = 29;
        }
        //月份累加天数
        for (int i = 0; i < month - 1; i++) {
            days += monthDay[i];
        }
        days += day + yearsDays;//总天数
        int dy = days % 5;//取模
        if (dy == 4 || dy == 0) {//0 4 代表晒网
            System.out.println(year + "年" + month + "月" + day + "日" +
                    "\t晒网" + "\t总天数：" + days);
        } else {//1 2 3代表打鱼
            System.out.println(year + "年" + month + "月" + day + "日" +
                    "\t打鱼" + "\t总天数：" + days);
        }

    }
}
//方式二
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

```