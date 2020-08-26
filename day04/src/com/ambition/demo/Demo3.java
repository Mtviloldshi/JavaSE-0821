package com.ambition.demo;
/*
    数组
 */
public class Demo3 {
    public static void main(String[] args) {
        //1.声明数组
        int[] arr;//整形数组
        int arr2[];//不推荐
        //2.初始化、赋值，
        //本质上：初始化是在内存中开辟空间
        //方式一：静态初始化,没有给指定数组的长度
        arr = new int[]{1,2,3,4,5};
//        int[] arr3;
//                arr3 = {1,2,3,4,5};//错误
        int[] arr3 = {1,2,3,4,5};
        //方式二：动态初始化，直接给定长度
        String[] names = new String[3];
        //3.使用数组
        System.out.println(arr[0]);//通过索引取出数据
        System.out.println(arr[1]);//通过索引取出数据
        System.out.println(arr[2]);//通过索引取出数据
        System.out.println(arr[3]);//通过索引取出数据
        System.out.println(arr[4]);//通过索引取出数据
        //数组赋值
        names[0] = "tome";
        names[1] = "jack";
        names[2] = "marry";
        System.out.println( names[0]);
        System.out.println( names[1]);
        System.out.println( names[2]);

        //声明
        double[] dob = new double[]{1.1,2,3,4,5};
        char[] ch = new char[5];
        String[] str = {"cc","aa","bb"};
    }
}
