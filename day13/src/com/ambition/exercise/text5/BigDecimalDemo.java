package com.ambition.exercise.text5;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/18:56
 * @Description:
 *
 * 不可变的、任意精度的有符号十进制数。
 * BigDecimal(String val)
 * BigDecimal add(BigDecimal val)
 * BigDecimal subtract(BigDecimal val)
 * BigDecimal multiply(BigDecimal val)
 * BigDecimal divide(BigDecimal val)
 * BigDecimal divide(BigDecimal divisor, int roundingMode)
 * BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
 * BigDecimal remainder(BigDecimal val)
 * double doubleValue():将此 BigDecimal 转换为 double。
 */
public class BigDecimalDemo {
    @Test
    public void test1(){
//        BigDecimal(String val)
        BigDecimal number = new BigDecimal("1237327327427128");
        BigDecimal numbe2r = new BigDecimal("17327234312427427128");
//        BigDecimal add(BigDecimal val)
        System.out.println(number.add(numbe2r));
//        BigDecimal subtract(BigDecimal val)
        System.out.println(number.subtract(numbe2r));
//        BigDecimal multiply(BigDecimal val)
        System.out.println(numbe2r.multiply(number));
//        BigDecimal divide(BigDecimal val)
        System.out.println(numbe2r.divide(number,1));
//        BigDecimal divide(BigDecimal divisor, int roundingMode)
        System.out.println(numbe2r.remainder(number));
        System.out.println("-------------------");
//        BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)

//        BigDecimal remainder(BigDecimal val)
        System.out.println(numbe2r.remainder(number));
//        double doubleValue():将此 BigDecimal 转换为 double。
        System.out.println(numbe2r.doubleValue());
    }
}
