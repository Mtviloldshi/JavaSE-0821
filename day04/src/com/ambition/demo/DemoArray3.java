package com.ambition.demo;
/*
    数组
        数组的长度一旦确定就不能修改（重要）
        存储的元素为相同的数据类型（定义时指定数据类型）
        有索引，创建数组时会在内存中开辟一整块连续的空间。
        存取元素的速度快，因为可以通过[下标]，直接定位到任意一个元素
 */
public class DemoArray3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        arr[3] = 44;//java.lang.ArrayIndexOutOfBoundsException：角标越界
    }
}
