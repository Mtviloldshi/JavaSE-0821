package com.ambition.exercise;

//第五题
public class Test5 {

    public static void main(String[] args) {
        int a = 20, b = 20;
        //判断是否能够被3和7整除
        boolean bo = (++a % 3 == 0 && a++ % 7 == 0) ? true : false;
        System.out.println(bo);
        System.out.println(a);
        //判断是否能够被3和7整除
        boolean bo1 = (b++ % 3 == 0 && ++b % 7 == 0) ? true : false;
        System.out.println(bo1);
        System.out.println(b);
    }

}
