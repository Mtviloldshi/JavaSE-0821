package com.ambition.exercise;

import java.util.Scanner;

//比较两数是否相等
public class exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();

        double max = num1 > num2? num1 : num2;
        System.out.println(max);
    }
}
