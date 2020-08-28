package com.ambition.demo;

/*
    数组元素的删除
 */
public class Demo10_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //删除指定元素
        int index = 1;
        //指定角标数后面的数依次往前移动一位
        for (int i = 0; i < arr.length - 1; i++) {
            if (i >= index) {
                arr[i] = arr[i + 1];
            }
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
