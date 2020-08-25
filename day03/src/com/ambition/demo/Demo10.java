package com.ambition.demo;

import java.util.Scanner;

//if else if练习 有覆盖范围，范围小的放上层
//键盘录入学生成绩，判断学生等级
public class Demo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        double score = scan.nextDouble();

        if (score > 101 || score < -1){
            System.out.println("输入有误");
        }
        else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

    }
}
