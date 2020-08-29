package com.ambition.demo;
/*
    二维数组动态初始化
    基本格式：
        数据类型[][] 数组名 = new 数组类型[m][n];
        m：表实二维数组有m个一维数组，有m行
        n：每个一维数组有n个元素，
 */
public class TwoArray_demo2 {
    public static void main(String[] args) {
        //情况1.规则二维数组
        int[][] arr = new int[3][3];//元素有默认初始值0
        //访问数组
        System.out.println(arr);//地址
        System.out.println(arr[0]);//地址
        System.out.println(arr[0][0]);//0

        //重新赋值
        arr[0][0] = 11;
        arr[0][1] = 11;
        arr[0][2] = 11;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
    }
}
