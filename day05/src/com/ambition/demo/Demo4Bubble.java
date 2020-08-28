package com.ambition.demo;

/*
    求最小值 以及下标
 */
public class Demo4Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 8, 1,1,1};
        int index = 0;//初始化角标
        int min = arr[index];//默认最大值为角标为0的数
        int count = 0;//初始化最小值出现次数
        for (int i = 0; i < arr.length; i++) {
            //循环比较，
            if (min > arr[i]) {
                min = arr[i];//如果这个值小于默认最小值，就把这个值赋给最小值
                index = i;//把这个数角标赋给index
            }
            //当i 恒等于数组长度-1时 说明已经比较完成，(已经找出最小值)
            if (i == arr.length - 1){
                for (int j = 0; j < arr.length; j++) {
                    //循环比较
                    if (min == arr[j]) {
                        //如果有跟最小值相等的数，就加1
                        count++;
                    }
                }
            }
        }
        //第二种方式
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (max == arr[i]){
//                count++;
//            }
//        }
        System.out.println("最小值：" + arr[index] + "\t角标：" + index + "\t最小值个数:" + count);
    }
}
