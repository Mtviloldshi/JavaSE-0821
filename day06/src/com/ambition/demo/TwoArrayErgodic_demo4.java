package com.ambition.demo;

import java.util.Arrays;

/*
    二维数组遍历
 */
public class TwoArrayErgodic_demo4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //控制行数，arr1.length指的是二维数组的行数，即几个一维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        //方法遍历
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(Arrays.toString(arr1[i]));
//        }
    }
}
