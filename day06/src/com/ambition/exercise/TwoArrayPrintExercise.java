package com.ambition.exercise;

/*
        二维数组
            不规则初始化方式
 */
public class TwoArrayPrintExercise {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[arr.length];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
