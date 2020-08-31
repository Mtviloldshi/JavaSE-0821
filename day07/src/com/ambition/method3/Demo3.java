package com.ambition.method3;

/*
    方法重载: overload
        在一个类中，方法名相同，参数列表不同，称之为重载
        参数列表不同指的是：
            参数个数不同
            参数类型不同
 */
public class Demo3 {


    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(int a) {
        return a;
    }

    public static byte add(int a, int b,int c) {
        return 0;
    }
}
