package com.ambition.demo;

//冒泡排序
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 9, 1};
        //需求：1 2 3 6 8 9
        //思路
        /*
        第一轮：比较五次
        第二轮：比较四次
        第三轮：比较三次
        第四轮：比较二次
        第五轮：比较一次
         */
        //外层循环控制比较的轮数

        //所有数总共比较arr.length - 1轮
        for (int j = 0; j < arr.length - 1; j++){
            //内层比较次数
            //单个数总共比较 arr.length  - 1 次
            //arr.length - j 每进行一轮减少 一次循环
            //依次减少比较次数 arr.length - j - 1
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    //交换位置
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

//        //第一轮
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]){
//                //交换位置
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//
//        //第二轮
//        for (int i = 0; i < arr.length - 2; i++) {
//            if (arr[i] > arr[i + 1]){
//                //交换位置
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//
//        //第三轮
//        for (int i = 0; i < arr.length - 3; i++) {
//            if (arr[i] > arr[i + 1]){
//                //交换位置
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        //第四轮
//        //第五轮

        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i] + "\t");
        }
    }
}
