package com.ambition.exercise;

/*
    直接排序
        从第一个依次往最后一个比较 最小的往前
        每一轮都会选出一个最小值靠前
 */
public class ArrayDirectSortExercise {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 4, 5, 6, 1, 2, 3};

        //第一种方式
        for (int i = 0; i < arr.length - 1; i++) {
            /*
                第一轮：比较length -1 次
                第二轮：比较length -2 次
                。。。
                总共比较length-1轮
                第一轮比较从第一个数开始
                第二轮比较从第二个数开始
                ..依次增加
                所以j = 1
                    j = 2
                    j = 3
                    ....
                    每轮增加1
                    所以j = i + 1;
                    arr[i = 0] 和 arr[j = 0]不用比较
             */
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //        //第二种方式
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;//定义最小标识角标，每轮默认为i
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[min] > arr[j]) {//如果是最小值，将角标赋给min
//                    min = j;
//                }
//            }
//            //每轮循环完，不等于min 不等于 i的最后一个数
//            if (min != i){
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
