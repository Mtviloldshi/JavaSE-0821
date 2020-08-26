package com.ambition.demo;

public class DemoArray4 {
    public static void main(String[] args) {
        //动态初始化 开辟内存空间，并赋值
        /*
            int初始值：0
            引用数据类型String初始值：null
         */
        int[] arr = new int[3];
        System.out.println(arr[1]);//int初始值：0

        String[] str = new String[3];
        System.out.println(str[0]);//String类型初始值：null
    }
}
