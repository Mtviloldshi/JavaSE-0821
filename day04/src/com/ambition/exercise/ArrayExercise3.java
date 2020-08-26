package com.ambition.exercise;

import java.util.Scanner;

/*
    练习4：用数组存储一个星期的7个英文单词，然后从键盘输入星期的值[1-7]，输出对应的英文单词
 */
public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("请输入一个1-7的整数：");
        int num = scan.nextInt();
        System.out.println(str[num - 1]);//优化
//        switch (num){
//            case 1:
//                System.out.println(str[0]);
//                break;
//            case 2:
//                System.out.println(str[1]);
//                break;
//            case 3:
//                System.out.println(str[2]);
//                break;
//            case 4:
//                System.out.println(str[3]);
//                break;
//            case 5:
//                System.out.println(str[4]);
//                break;
//            case 6:
//                System.out.println(str[5]);
//                break;
//            case 7:
//                System.out.println(str[6]);
//                break;
//            default:
//                System.out.println("输入错误！");
//                break;
//        }
    }
}
