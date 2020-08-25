package com.ambition.demo2;

import java.util.Scanner;
/*
    switch练习：
        switch与if-else的区别
            1.条件是个范围的时候，使用if
            2.如果条件是个明确的值，使用switch
            3.if可以代替switch，switch代替不了if
 */



//需求：定义一个月份，输出该月份对应的季节。
//* 一年有四季
//* 3,4,5 春季
//* 6,7,8 夏季
//* 9,10,11 秋季
//* 12,1,2 冬季
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        switch (month){
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
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
