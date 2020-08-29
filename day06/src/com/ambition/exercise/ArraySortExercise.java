package com.ambition.exercise;

import java.util.Arrays;

/*
    直接排序
        二分法查找
 */
public class ArraySortExercise {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 9, 4, 5, 6, 3, 1, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int number = 9;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int index = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (number == arr[mid]) {
                index = mid;
                break;
            } else if (number > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("未找到!");
        }
    }
}
