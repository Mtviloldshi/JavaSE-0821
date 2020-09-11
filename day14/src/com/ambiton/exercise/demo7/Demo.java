package com.ambiton.exercise.demo7;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/21:20
 * @Description:
 *  包装类
 *      装箱：基本数据类型装箱为引用数据类型，可以直接使用引用数据类型独特的API
 *      拆箱：引用数据类型转换为基本数据类型，用于进行数据运算
 *
 *      jdk1.5之后支持自动装箱与拆箱
 *
 *   在缓存范围内共享一份数据，超出缓存范围均视为不同对象，即使是他们内容相同
 *      Integer Long Byte Shor 缓存范围为：-128-127
 *      Double Float 没有缓存范围
 *      Character 0-127
 */
public class Demo {
    String str2 = null;
    public static void main(String[] args) {
        //转换的前提是都是数值型，比如123，21.3.如果是"sjd"则报错

        //整型转字符串 三种方式
        String s = Integer.toString(1234);
        String s1 = String.valueOf(1234);
        String str = "" + 1234;

        //字符串转整型 integer
        Integer integer = Integer.valueOf("2222");
        //字符串转为 基本数据类型
        int i = Integer.parseInt("866589");
    }
}
