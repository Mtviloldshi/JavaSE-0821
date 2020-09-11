package com.ambition.exercise.text5;

import org.junit.Test;

import java.math.BigInteger;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/18:49
 * @Description:
 *
 * BigInteger(String val)
 * BigInteger add(BigInteger val)
 * BigInteger subtract(BigInteger val)
 * BigInteger multiply(BigInteger val)
 * BigInteger divide(BigInteger val)
 * BigInteger remainder(BigInteger val)
 * int intValue():将此 BigInteger 转换为 int。
 * long longValue():将此 BigInteger 转换为 long。
 * float floatValue():将此 BigInteger 转换为 float。
 */
public class BigIntegerDemo {
    @Test
    public void test(){
//        BigInteger(String val)//构造器
        BigInteger number = new BigInteger("124723748392823123");
        BigInteger number2 = new BigInteger("12472374839282382373123");
//        BigInteger add(BigInteger val)//两个BigInteger类型相加
        System.out.println(number.add(number2));
//        BigInteger subtract(BigInteger val)//相减
        System.out.println(number.subtract(number2));
//        BigInteger multiply(BigInteger val)//相乘
        System.out.println(number.multiply(number2));
//        BigInteger divide(BigInteger val)//求商
        System.out.println(number2.divide(number));
        System.out.println("------------");
//        BigInteger remainder(BigInteger val)//取余
        System.out.println(number2.remainder(number));
//        int intValue():将此 BigInteger 转换为 int。
        System.out.println(number.intValue());
//        long longValue():将此 BigInteger 转换为 long。
        System.out.println(number2.longValue());
//        float floatValue():将此 BigInteger 转换为 float。
        System.out.println(number.floatValue());
    }
}
