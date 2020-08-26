```
package com.ambition.exercise2;

import java.util.Scanner;

/*
## 第六题
    案例需求：假设从2000年1月1日开始三天打鱼，两天晒网，
    从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？
 */
public class Exercise1 {
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
            } else if (i == 5 || i == 7 || i == 10 || i == 12) {//提出1月份天数，以后每月往后推一个月，例：2月-->3月,比如输入5月份，不会把五月份的31添加上去。
                monthDay += 30;
            } else if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11 || i == 13) {
                monthDay += 31;
            }
        }
        days = day + monthDay;//总天数
        int dy = days % 5;//取模
        if (dy == 4 || dy == 0) {//0 4 代表晒网
            System.out.println(year + "年" + month + "月" + day + "日" +
                    "晒网" + "总天数：" + days);
        } else {//1 2 3代表打鱼
            System.out.println(year + "年" + month + "月" + day + "日" +
                    "打鱼" + "\t总天数：" + days);
        }

    }
}

```