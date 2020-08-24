package com.ambition.node;

//练习三元运算符
public class Demo10 {

    public static void main(String[] args) {
        // 声明三个整型的变量,a,b,c,要求找出最大值
        int a = 3, b = 4, c = 5;
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        // max = max > c? max : c;
        System.out.println(max);

        // 声明一个整型的变量，判断它是正数还是负数，还是0
        int i = 0;
        String result = i > 0 ? "正数" : (i == 0 ? "0" : "负数");
        System.out.println(result);
    }

}
