package com.ambition.exercise;

import java.util.Scanner;

/*
    1. 练习1：用一个数组存储26个小写英文字母，并遍历显示，显示要求如：a->A
 */
public class ArrayExercise4 {
    public static void main(String[] args) {
        //静态初始化一个char型数组
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + "->" + (char)(ch[i] - 32));
        }
    }
}
