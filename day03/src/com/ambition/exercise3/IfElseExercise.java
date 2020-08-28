package com.ambition.exercise3;

import java.util.Scanner;

/*
    2、岳小鹏参加Java考试，他和父亲岳不群达成承诺：如果：
        成绩为100分时，奖励一辆BMW；
        成绩为(80，99]时，奖励一台iphone7plus；
        当成绩为[60,80]时，奖励一个 iPad；
        其它时，什么奖励也没有。
        请从键盘输入岳小鹏的期末成绩，并加以判断
 */
public class IfElseExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入越小彭成绩：");
        int score;
        while (true) {
            score = scan.nextInt();
            if (score > 0 && score < 101) {
                if (score == 100) {
                    System.out.println("奖励一辆BMW！");
                } else if (score >= 80 && score < 100) {
                    System.out.println("奖励一台iphone7plus");
                } else if (score >= 60 && score < 80) {
                    System.out.println("奖励一个 iPad");
                } else {
                    System.out.println("什么奖励也没有");
                }
                break;
            }
            System.out.println("成绩输入有误，请重新输入：");
        }

    }
}
