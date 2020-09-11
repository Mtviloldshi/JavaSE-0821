package com.ambiton.Test04;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/14:23
 * @Description:
 *
 * 包装类：
 *      int     Integer
 *      byte    Byte
 *      short   Short
 *      long    Long
 *      float   Float
 *      double  Double
 *      char    Character
 *      boolean Boolean
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer i = 10;//自动装箱
        int b = i;//自动拆箱

        //字符串转整数
        int i1 = Integer.parseInt("123");//解析字符串为整数
        System.out.println(i1);
        Integer integer = Integer.valueOf("456");//任意类型转包装类
        System.out.println(integer);
        System.out.println("----------------");

        //整数转字符串
        String s = integer.toString();
        String s1 = String.valueOf(123);
        System.out.println(s);
        System.out.println(s1);

        //进制转换
        String s2 = Integer.toBinaryString(32);
        System.out.println(s2);

        String num = "123";
        //字符串转integer
        int i2 = Integer.parseInt(num);
        Integer integer1 = Integer.valueOf(num);

        //integer转字符串
        String s3 = String.valueOf(i2);
        String s4 = integer1.toString();
    }
}
