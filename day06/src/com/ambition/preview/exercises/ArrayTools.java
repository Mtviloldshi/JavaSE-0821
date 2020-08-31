package com.ambition.preview.exercises;

/*
    1）静态方法1：可以实现给任意整型数组实现从小到大排序 （2）静态方法2：可以遍历任意整
    型数组，返回结果效果：[元素1，元素2，元素3。。。]
 */
public class ArrayTools {
    //从小到大排序数组
    public static int[] sort(int[] arr) {
        int[] arr2;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arr2 = arr;
        return arr2;
    }

    //遍历数组
    public static void printArr(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
}
