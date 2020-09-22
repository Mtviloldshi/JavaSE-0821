package com.ambition.demo.demo1;

import java.util.Comparator;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/9:47
 * @Description:
 *
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        Comparator<String> c1 =
                (o1, o2) -> o1.length() - o2.length();

        System.out.println(c1.compare("hello", "ss"));
    }
}
