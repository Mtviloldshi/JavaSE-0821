package com.ambition.exercise;

import java.util.Scanner;

//练习if-else
public class exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数：");
        //比较两个数大小
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println(a + " 大于 " + b);
        }
        if (a < b) {
            System.out.println(b + " 大于 " + a);
        } else {
            System.out.println(b + " 等于 " + a + "\n");
        }

        //比较三个数大小
        int i = 10, j = 20, k = -80;
        if (i > j && i > k) {
            System.out.println("max = " + i);
        }
        if (j > i && j > k) {
            System.out.println("max = " + j);
        } else {
            System.out.println("max = " + k);
        }
    }
}
