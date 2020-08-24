package com.ambition.node;

/*
 * 	++、--自增、自减
 */
public class Demo4 {

    public static void main(String[] args) {
        int a = 3, b = 4;
        //一、后++
        // 1.单独使用
        a++;// 自增
        a--;// 自减

        System.out.println("a = " + a);

        // 组合使用，先使用，再自增
        int c = a++;
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        a=a++;
        System.out.println(a);

        //二、前++
        //1、单独使用前++，后++没区别
        //2、先自增，后使用
        ++a;
        System.out.println(a);

    }

}
