package com.ambition.exercise4;

/*
     10.
     9*9乘法表
 */
public class NightNightExcelExercise {
    public static void main(String[] args) {
        //控制行数
        for (int i = 1; i < 10; i++) {
            //控制列
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            //换行
            System.out.println();
        }
    }
}
