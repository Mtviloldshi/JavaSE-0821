package com.ambition.method.exercise;

/*
    定义一个工具类 计算任意两个数的+ - * /
        要求都有返回结果
 */
public class MethodTools {
    //+

    /**
     * 求和方法
     * @param a 一个整数
     * @param b 另一个整数
     * @return a+b
     */
    public static int twoNumber(int a, int b) {
        return a + b;
    }

    //-
    public static double twoNumber(double a, double b) {
        return a - b;
    }

    //*
    public static int twoNumber2(int a, int b) {
        return (a * b);
    }

    //  /
    public static long twoNumber3(long a, long b) {
        return a / b;
    }

}
