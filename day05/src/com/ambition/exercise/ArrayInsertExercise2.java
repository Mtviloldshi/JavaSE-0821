package com.ambition.exercise;

import java.util.Arrays;

/*
    数组指定位置插入数据
 */
public class ArrayInsertExercise2 {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {1, 5, 6, 8, 7, 9, 3};
        //初始化新数组
        int[] newArray = new int[arr.length + 1];
        //初始化插入数据角标
        int index = 3;
        //把旧数组的值赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //把新数组的地址给到老数组得到扩容
        arr = newArray;//不直接操作新数组是因为要在原数组基础上插入数据

        //移动数据,往后移动
        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        //插入数据
        arr[index] = 2;

        System.out.println(Arrays.toString(arr));
    }
}
