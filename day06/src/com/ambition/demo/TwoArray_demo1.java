package com.ambition.demo;

/*
    二维数组的静态初始化，我们给数组初始化值，但不给长度，长度由系统给定
 */
public class TwoArray_demo1 {
    public static void main(String[] args) {
        //1.先声明，再初始化
        int[][] arr;
//        int arr1 [][]; 不推荐使用
//        int[] arr2[];

        arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //声明的同时进行初始化
        int[][] arr1= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //简化
        int[][] arr2= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //访问二维数组
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
    }
}
