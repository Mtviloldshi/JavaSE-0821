package com.ambition.exercise.homework8;

public class Test11 {
    static int x, y, z;

    static {
        int x = 5;
        x--;// x = 4
    }

    static {
        x--; //x = -1
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);// -1 使用的时成员变量
        z--;//-1
        method();
        System.out.println("result:" + (z + y + ++z));// 1 + 0 + 2 = 3
    }

    public static void method() {
        y = z++ + ++z;//y = 0 z = 1
    }
}
