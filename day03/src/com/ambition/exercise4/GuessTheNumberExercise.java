package com.ambition.exercise4;

import java.util.Scanner;

/*
    4、随机生成一个100以内的正整数，猜数字游戏
    从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了
    多少次
    提示：随机数
    （1）Math.random()
    double num = Math.random();// [0,1)的小数
    （2）java.util.Random rand = new java.util.Random();
    int num= rand.nextInt(100);//[0,100)的整数
 */
public class GuessTheNumberExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number, i = 0;
        //产生一个随机数
        int randomNumber = (int) (Math.random() * 100);
        while (true) {
            number = scan.nextInt();
            if (number > -1 && number < 101) {
                i++;
                if (number == randomNumber) {
                    System.out.println("猜对了");
                    break;
                } else if (number > randomNumber) {
                    System.out.println("猜高了");
                } else {
                    System.out.println("猜低了");
                }
            }else {
                System.out.println("输入数据有误");
            }
        }
        System.out.println("一共猜了：" + i + "次");
    }
}
