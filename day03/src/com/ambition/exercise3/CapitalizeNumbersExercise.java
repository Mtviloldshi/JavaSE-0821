package com.ambition.exercise3;

import java.util.Scanner;

/*
    第8题：转大写数字
    8、使用 switch 把阿拉伯数字转为“壹、贰、叁、肆、伍、陆、柒、捌、玖”；其它的都输出 “other”。
 */
public class CapitalizeNumbersExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = scan.nextInt();
        switch (number) {
            case 0:
                System.out.println("零");
                break;
            case 1:
                System.out.println("壹");
                break;
            case 2:
                System.out.println("贰");
                break;
            case 3:
                System.out.println("叁");
                break;
            case 4:
                System.out.println("肆");
                break;
            case 5:
                System.out.println("伍");
                break;
            case 6:
                System.out.println("陆");
                break;
            case 7:
                System.out.println("柒");
                break;
            case 8:
                System.out.println("捌");
                break;
            case 9:
                System.out.println("玖");
                break;
            default:
                System.out.println("other");
        }
    }
}
