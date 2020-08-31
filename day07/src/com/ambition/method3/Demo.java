package com.ambition.method3;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        change(a, b);
        System.out.println("a = " + a + "--b = " + b);
    }

    public static void change(int a, int b) {//形式参数
        int temp = a;
        a = b;
        b = temp;
    }

}
