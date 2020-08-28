package com.ambition.exercise4;

/*
    第2题：1-100偶数
    2、打印1-100的偶数
 */
public class PrintEvenExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
