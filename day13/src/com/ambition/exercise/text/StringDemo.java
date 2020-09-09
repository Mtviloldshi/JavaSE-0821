package com.ambition.exercise.text;

import org.junit.Test;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/19:13
 * @Description:
 * （1）boolean isEmpty()：字符串是否为空
 * （2）int length()：返回字符串的长度
 * （3）String concat(xx)：拼接，等价于+
 * （4）boolean equals(Object obj)：比较字符串是否相等，区分大小写
 * （5）boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，区分大小写
 * （6）int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小
 * （7）int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
 * （8）String toLowerCase()：将字符串中大写字母转为小写
 * （9）String toUpperCase()：将字符串中小写字母转为大写
 * （10）String trim()：去掉字符串前后空白符
 */
public class StringDemo {

    @Test
    public void test2(){
        String str = " hello world  ";
        String str2 = "JAva";

        //（7）int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
        System.out.println(str.compareToIgnoreCase(str2));

        //（8）String toLowerCase()：将字符串中大写字母转为小写
        System.out.println(str2.toLowerCase());

        //（9）String toUpperCase()：将字符串中小写字母转为大写
        System.out.println(str.toUpperCase());
        System.out.println(str2.toUpperCase());
        //（10）String trim()：去掉字符串前后空白符
        System.out.println(str.trim());
    }

    @Test
    public void test1(){
        String str = "hello world";
        String str2 = "java";

        //（1）boolean isEmpty()：字符串是否为空
        System.out.println(str.isEmpty());

        //2）int length()：返回字符串的长度
        System.out.println(str.length());

        //（3）String concat(xx)：拼接，等价于+
        System.out.println(str.concat(str2));

        //（4）boolean equals(Object obj)：比较字符串是否相等，区分大小写
        System.out.println(str.equals(str2));

        //（5）boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，区分大小写
        System.out.println(str.equalsIgnoreCase(str2));

        //（6）int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小
        System.out.println(str.compareTo(str2));
    }
}
