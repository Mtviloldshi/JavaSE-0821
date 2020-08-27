package com.ambition.exercise2;
/*
    做了1.5小时
        错误在对数组理解的不通透和粗心
 */
import java.util.Scanner;

/*
   第7题
    1、从键盘输入本组学员人数
    2、声明两个数组，一个存储本组学员的姓名，一个存储本组学员的成绩
    3、从键盘输入每一个人的姓名和成绩，分别存到两个数组中
    4、找出最高分和最低分的学员的姓名
 */
public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学员人数:");
        int peoples = scan.nextInt();
        //初始化数组，长度为输入学员人数长度
        String[] names = new String[peoples];
        int[] scores = new int[peoples];

        //循环接收数据
        for (int i = 0; i < names.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学员姓名：");
            names[i] = scan.next();
            System.out.print("请输入第" + (i + 1) + "位学员成绩：");
            scores[i] = scan.nextInt();
        }
        //求出最大值
        int max = scores[0], min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        //得出最大值角标
        int maxIndex = 0,mixIndex = 0;
        for (int k = 0; k < scores.length; k++) {
            if (max == scores[k]){
                maxIndex = k;
            }
            if (min == scores[k]){
                mixIndex = k;
            }
        }
        //输出
        System.out.println("最低分："+max + " 学生姓名为："+ names[maxIndex]);
        System.out.println("最高分："+min + " 学生姓名为："+ names[mixIndex]);
    }
}
