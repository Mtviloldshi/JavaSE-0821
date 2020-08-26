package com.ambition.exercise;

import java.util.Scanner;

//判断素数
/*
    案例：从键盘输入一个大于1的自然数，判断它是否是素数 提示：素数是指大于1的自然数中，除
    了1和它本身以外不能再有其他因数的自然数，即某个素数n，在[2,n-1]范围内没有其他自然数可
    以把n整除
    去除偶数，只做奇数判断
 */
public class exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个大于1的自然数：");
        int num;
        while (true) {
            num = scan.nextInt();
            if (num > 1) {
                break;
            }
            System.out.println("输入错误,请重新输入");
        }
        int i;
        //优化，开方 Math.sqrt(num)
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                break;
            }
        }
        if (i >= num){
            System.out.println(num + "是素数");
        }else {
            System.out.println(num + "不是素数");
        }
    }
}
