package com.ambition.exercise;

/*
    数组指定角标插入数据
 */
public class ArrayInsertExercise {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArray = new int[arr.length + 1];
        //初始化插入角标
        int index = 1;
        //赋值数组
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //newArray把地址给到arr数组
        arr = newArray;

        //如果i >= 插入数角标，那么后面的数依次往后移动 (顺序：从后往前)-->前-->后数据会被覆盖
        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = newArray[i];//前面的数往后移
        }
        //输入插入的值
        arr[index] = 2;
        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
