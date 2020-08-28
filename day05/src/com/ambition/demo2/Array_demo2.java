package com.ambition.demo2;

/*
    4.8.6 数组的直接选择排序（了解
 */
public class Array_demo2 {
    public static void main(String[] args) {
        int[] arr = {49, 23, 45, 78, 99, 23, 45, 62, 46};

        //优化
        //外循环控制轮数
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;//定义默认最小值标识
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    //如果比最小值小，把角标赋给min
                    min = j;
                }
            }
            //如果角标相等，不做交换
            if (min != i) {
                //如果角标不等，就进行交换
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

//        //外循环控制轮数
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
