package com.ambition.exercise2;

import java.util.Scanner;

/*
    2. 语法案例演示1：判断某个数是否是素数
    案例：从键盘输入一个大于1的自然数，判断它是否是素数 提示：素数是指大于1的自然数中，除
    了1和它本身以外不能再有其他因数的自然数，即某个素数n，在[2,n-1]范围内没有其他自然数可
    以把n整除
 */
public class ForIFExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个大于1的自然数：");
        int num;
        //判断是否大于一
        do {
            num = scan.nextInt();
            if (num < 1) {
                System.out.println("输入错误，请重新输入：");
            }
        } while (num < 1);

        //判断是否为素数
        //从2开始，一直除以到本身的数
        boolean flag = true;//定义标识
//        for (int i = 2; i <num; i++) {
        //优化 使用Math.sqrt() 需要加上<=
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                //跳出能被整除的数,并将标识符赋值为false
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num + "是素数");
        }else {
            System.out.println(num + "不是素数");
        }
    }
}
