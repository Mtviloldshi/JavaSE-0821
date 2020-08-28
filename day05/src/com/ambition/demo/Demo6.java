package com.ambition.demo;

//数组的反正
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 8, 4, 6, 1, 3};
        //方式一：借助新数组实现
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - i -1] = arr[i];//把旧数组的开始位置的元素，放在新数组的最后位置，新数组位置减小
        }
        arr = newArr;
        for (int i = 0; i  < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
