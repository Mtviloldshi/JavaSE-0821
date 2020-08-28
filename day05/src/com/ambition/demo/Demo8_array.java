package com.ambition.demo;

//数组的扩容
public class Demo8_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //要添加的新元素
        int num = 100;
        //创建新数组
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        //复制数组
        arr = newArray;
        arr[arr.length - 1] = num;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
