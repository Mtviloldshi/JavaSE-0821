package com.ambition.exercise3;

import java.util.Scanner;

/*
    第9题：月份季节
    9、根据用于指定月份，打印该月份所属的季节。
    3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
 */
public class MonthSeasonExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        if (month > 0 && month < 13) {
            switch (month) {
                case 1:
                case 2:
                case 12:
                    System.out.println("冬季");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
            }
        } else {
            System.out.println("输入错误！");
        }
    }
}
