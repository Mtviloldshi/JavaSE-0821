package com.ambition.demo2;

/*
    4.8.5 数组的二分查找（了解）
    二分查找：对折对折再对折
    要求：要求数组元素必须支持比较大小，并且数组中的元素已经按大小排好序
 */
public class Array_demo1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 10, 21, 41, 101, 270};//数组是有序的
        //顺序查找的时间复杂度（n）
        //二分查找O（logn）
        int value = 11;
        int left = 0;//左边界
        int right = arr.length - 1;//右边界
        int mid = (left + right) / 2;//中间位置
        int index = -1;
        while (left <= right) {
            if (arr[mid] == value){
                index = mid;
                break;
            }else if (value > arr[mid]){
                left = mid + 1;//重置左边界的位置左边界位置
            }else if(value < arr[mid]){
                right = mid -1;//充值右边界位置
            }
            mid = (left + right) / 2;
        }
        System.out.println("角标"  +  index);
    }
}
