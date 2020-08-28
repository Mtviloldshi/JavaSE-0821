package com.ambition.exercise4;

/*
   12.
    打印菱形
 */
public class PrintDiamondExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 - i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
