package com.ambition.exercise3;

import java.util.Scanner;

/*
    第1题：成绩及格
    1  、从键盘输入一个分数，如果60分（含）以上，就打印合格，如果60分以下，就打印不合格
 */
public class IFExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int score = scan.nextInt();
        if (score > -1 && score < 101){
            if (score > 59 && score < 101){
                System.out.println("成绩合格！");
            }else{
                System.out.println("成绩不合格！");
            }
        }else {
            System.out.println("输入数字错误！");
        }
        //另一种方法 三目运算符
    }
}
