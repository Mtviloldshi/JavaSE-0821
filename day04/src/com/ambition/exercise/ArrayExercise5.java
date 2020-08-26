package com.ambition.exercise;

import java.util.Scanner;

/*
    5. 练习5：用数组存储平年每一个月的总天数，从键盘输入年，月，日，输出这一天是这一年的第几天
    提示：闰年（1）能被4整除不能被100整除（2）或能被400整除的年份
 */
public class ArrayExercise5 {
    public static void main(String[] args) {
        int sumDays = 0;
        //存储平年每个月天数
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        //创建键盘扫描器
        Scanner scan = new Scanner(System.in);
        //提示信息
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入日期：");
        int day = scan.nextInt();
        //循环输出月份总天数
        if ((year % 4 ==0 && year%100 !=0) || year % 400 == 0){
            days[1] = 29;
        }
        for (int i = 0;i < month - 1;i++){
            sumDays += days[i];
        }
        sumDays += day;
        System.out.println(year + "年" + month + "月" + day + "是这一年的第" + sumDays + "天");
    }
}
