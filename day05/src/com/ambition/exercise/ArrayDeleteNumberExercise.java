package com.ambition.exercise;

import java.util.Arrays;

/*
    删除数组指定元素
 */
public class ArrayDeleteNumberExercise {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {1, 5, 6, 7, 9, 3, 5};
        //初始化删除元素角标
        int index = 2;
        //前移数据
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
