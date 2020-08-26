package com.ambition.demo;

/*
    数组的访==遍历
 */
public class DemoArray2 {
    public static void main(String[] args) {
        //1.声明并初始化数组
        int[] arr = {11, 22, 33, 44, 55};
        //2.遍历数组 : arr.length表示数组的长度
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("数组的长度是 :" + arr.length);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
