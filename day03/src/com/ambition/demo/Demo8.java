package com.ambition.demo;

import java.util.Scanner;

//if-else
public class Demo8 {
    public static void main(String[] args) {
        //键盘录入一个整数判断是奇数还是偶数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scan.nextInt();

        if (num % 2 == 0){//条件成立执行
            System.out.println(num + "是一个偶数");
        }else{//否则执行这里
            System.out.println(num + "是一个奇数");
        }
    }
}
