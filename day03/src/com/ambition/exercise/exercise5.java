package com.ambition.exercise;

import java.util.Scanner;

//案例：从键盘输入年份，请输出该年的2月份的总天数。闰年2月份29天，平年28天。
//闰年条件：（1）能被4整除，不能被100整除（2）能被400整除
public class exercise5 {
    public static void main(String[] args) {
        //创建扫描器
        Scanner scan = new Scanner(System.in);
        //提示信息
        System.out.println("请输入年份:");
        //初始化总天数
        int day = 28;
        int year = scan.nextInt();
        if (year > 0){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                day++;
            }
            System.out.println(year + "年\t2月份总天数："  +  day);
        }
        System.out.println("输入年份有误！");
    }
}
