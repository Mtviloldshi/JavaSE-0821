package com.ambition.node;
/*
 * 数据类型转换
 * ***byte short char 直接进行运算，全部提升为int类型进行计算！！
 */
public class Demo1 {

    public static void main(String[] args) {
        int i = 10;
        double d = 10;//int 类型自动提升为double
        int i2 = 'a';//char 类型自动提升为int类型

        byte b = 1;
        short s = 2;
        int i3 = 3;
        double d2 = 4.0;
        System.out.println(b+s+i3+d2);//***默认输出字节最大类型！！！

        byte bb = 1;
        byte bb2 = 2;

        //byte bb3 = bb + bb2;//byte short char 直接进行运算，全部提升为int类型进行计算

    }

}
