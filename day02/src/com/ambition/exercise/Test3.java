package com.ambition.exercise;

//第三题
public class Test3 {

    public static void main(String[] args) {
        char ch = 'J';
        char ch1 = (char) (ch + 32);
        System.out.println(ch1);

        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);

        double b3 = 100.5;
        int i3 = 3;
        double sum0 = b3 + i3;
        int sum = (int) (b3 + i3);
        System.out.println("sum3的值：" + sum0);
        System.out.println("sum3的整数部分的值：" + sum);

        double d4 = 4.0;
        int i4 = 435;
        int mul4 = (int) (d4 * i4);
        System.out.println("mul4的整数部分的值：" + mul4);
    }

}

