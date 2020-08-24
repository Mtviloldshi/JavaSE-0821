package com.ambition.node;

//位移运算符
public class Demo12 {

    public static void main(String[] args) {
        // 右移n,除以2^n 如果不能整除，向下取整
        int a = 3 >> 1;
        // 0000 0011
        System.out.println(a);

        // 左移n,乘以2^n
        int b = 3 << 1;
        //000 00110
        System.out.println(b);

        int c = 3<<2;
        System.out.println(c);
    }

}
