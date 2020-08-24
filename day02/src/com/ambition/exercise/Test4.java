package com.ambition.exercise;
//第四题
public class Test4 {

    public static void main(String[] args) {
        int a1 = 10, a2 = 11, a3 = 12 , a4 = 13;
        System.out.println("10是偶数？" + (a1 % 2 == 0));
        System.out.println("11是偶数？" + (a2 % 2 == 0));
        System.out.println("12是奇数？" + (a3 % 2 != 0));
        System.out.println("13是奇数？" + (a4 % 2 != 0));
    }

}
