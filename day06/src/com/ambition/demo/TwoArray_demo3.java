package com.ambition.demo;
/*
    二维数组动态初始化:不规则二维表
    基本格式：
        数据类型[][] 数组名 = new 数组类型[m][];
        m：表实二维数组有m个一维数组，有m行
        n：每个一维数组有n个元素，
        数组名[0] = 一维数组
 */
public class TwoArray_demo3 {
    public static void main(String[] args) {
        //情况2.不规则二维数组
        int[][] arr = new int[3][];//元素有默认初始值0
        System.out.println(arr[0]);//null

        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{4,5};
        arr[2] = new int[]{6};

        System.out.println(arr[0]);//地址
        System.out.println(arr[0][2]);//3
        System.out.println(arr[2][1]);//角标越界
//        //访问数组
//        System.out.println(arr);//地址
//        System.out.println(arr[0]);//地址
//        System.out.println(arr[0][0]);//0
//
//        //重新赋值
//        arr[0][0] = 11;
//        arr[0][1] = 11;
//        arr[0][2] = 11;
//
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
    }
}
