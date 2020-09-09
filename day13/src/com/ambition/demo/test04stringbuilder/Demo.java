package com.ambition.demo.test04stringbuilder;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/15:35
 * @Description:
 *
 * 可变字符串
 *  StringBuilder 线程不安全的 效率高
 *  StringBuffer 线程安全的 效率低
 */
public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        StringBuffer sb2 = sb.append("world");
        System.out.println(sb);
        System.out.println(sb == sb2);
        sb2.append("java");
        System.out.println(sb);

        StringBuilder sb3 = new StringBuilder("abc");
        sb3.append("efg");
        sb3.append("hijk");
        System.out.println(sb3);

        String s2 = sb3.toString();
        System.out.println(s2);
    }
}
