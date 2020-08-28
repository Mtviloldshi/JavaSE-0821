package com.ambition.demo2;

import java.util.Arrays;

/*
    排序方法
 */
public class ArraySort_demo {
    public static void main(String[] args) {
        int[] arr = {15, 8, 9, 7, 6, 8, 5, 6, 8, 6, 5, 3};
        //排序
        Arrays.sort(arr);

        //二分查找
        int i = Arrays.binarySearch(arr, 38);
        System.out.println(i);

        //遍历
        System.out.println(Arrays.toString(arr));
    }
}
