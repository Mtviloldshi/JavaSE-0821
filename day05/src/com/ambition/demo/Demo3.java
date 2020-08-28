package com.ambition.demo;

/*
    求最值 查找最值及其第一次出现的下标
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {13, 12, 15, 22, 66, 77, 42, 10, 99, 34};
        //假定第一个元素为最大值
        int index = 0;
        int max = arr[index];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + "索引:" + index);
    }
}
