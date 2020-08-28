package com.ambition.exercise3;

/*
    10、编写程序，从键盘接收整数参数.如果该数为1-7，打印对应的星期值，否则打印“非法参数”。
 */
public class WordsOfTheWeekExercise {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入星期（1-7）：");
        int week = input.nextInt();
        switch (week) {
            default:
                System.out.println("输入有误,非法参数");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
