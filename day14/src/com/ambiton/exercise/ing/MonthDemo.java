package com.ambiton.exercise.ing;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/10:57
 * @Description:
 */
public class MonthDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数(1-12):");
        String i = scanner.next();
        Month byValue = Month.getByValue(i);
        System.out.println(byValue.toString());
    }
}
