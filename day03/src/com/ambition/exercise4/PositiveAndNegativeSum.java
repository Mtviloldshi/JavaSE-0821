package com.ambition.exercise4;

import java.util.Scanner;

/*
    第3题：正负数个数
    3、从键盘输入整数，输入0结束，统计输入的正数、负数的个数。
 */
public class PositiveAndNegativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,zhengShu = 0,Fushu = 0;
        System.out.println("请输入整数，输入0结束：");
        do {
            number = scan.nextInt();
            if (number == 0){
                break;
            }else if (number > 0){
                zhengShu++;
            }else {
                Fushu++;
            }
        }while (number != 0);

        System.out.println("正数个数为: " + zhengShu);
        System.out.println("负数个数为: " + Fushu);

    }
}
