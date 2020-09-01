package com.ambition.digui;

/*
    统计1-100自然数之和
 */
public class Demo2 {
    public static void main(String[] args) {
        //方法一 循环
        System.out.println(sum(100));
    }

    public static int sum(int n) {
        if (n == 1){
            return n;
        }else {
            return n + sum(n - 1);
        }
    }
}
