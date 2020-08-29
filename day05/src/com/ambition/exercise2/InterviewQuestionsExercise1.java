package com.ambition.exercise2;

/*
    1、编程题1
    找出数组中一个值，使其左侧值的加和等于右侧值的加和，
    例如：[1,2,5,3,2,4,2]，结果为：第4个值3
    [9, 6, 8, 8, 7, 6, 9, 5, 2, 5]，结果是没有
 */
public class InterviewQuestionsExercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 2, 4, 2};

        for (int j = 1; j < arr.length - 1; j++) {
            int left = 0, right = 0;
            for (int k = 0; k < j; k++) {
                left += arr[k];
            }
            for (int k = j + 1; k < arr.length; k++) {
                right += arr[k];
            }
            if (left == right) {
                System.out.println("第" + (j + 1) + "个值：" + arr[j]);
            }
        }
    }
}
