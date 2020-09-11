package com.ambiton.Test04;

import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/15:50
 * @Description:
 */
public class WeekDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字(1-7):");
        String number = scanner.next();
        Week byValue = Week.getByValue(number);
        System.out.println(byValue);
    }
}
