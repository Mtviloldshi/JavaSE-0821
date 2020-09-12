package com.ambition.exercise.ing5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/18:43
 * @Description:
 *
 * 案例：键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：
 * aaaabbbcccddd，打印结果为：abcd。效果如图：
 *
 * 利用set集合添加元素的唯一性
 */
public class Demo {
    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = scan.next();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }

        System.out.println("去重后：");
        for (char aChar : set) {
            System.out.print(aChar);
        }
    }
}
