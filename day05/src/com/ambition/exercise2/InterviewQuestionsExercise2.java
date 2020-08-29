package com.ambition.exercise2;

import java.util.Arrays;

/*
       2、编程题2
        左奇右偶
        10个整数的数组{26,67,49,38,52,66,7,71,56,87}。
        元素重新排列，所有的奇数保存到数组左边，所有的偶数保存到数组右边。
        代码实现，效果如图所示
 */
public class InterviewQuestionsExercise2 {
    public static void main(String[] args) {
        int[] arr = {26, 67, 49, 38, 52, 66, 7, 71, 56, 87};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i - 1; j++) {
                if (arr[j] % 2 == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}