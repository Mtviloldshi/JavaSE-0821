package com.ambition.demo;

/*
    插入数组
 */
public class Demo9_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        //初始化插入角标
        int index = 1;
        //创建新数组
        int[] newArray = new int[arr.length];
        //复制数组
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //{1 2 3 4 0}
        //
        //从角标位置往后移动，从最后一位开始移动
        for (int i = newArray.length - 2; i >= index; i--) {
            newArray[i + 1] = newArray[i];
        }

        //插入数据
        newArray[1] = 5;
        arr = newArray;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
