package com.ambiton.exercise.demo6;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/20:57
 * @Description:
 *  static int binarySearch(int[] a, int key) ：要求数组有序，在数组中查找key是否存在，如果存在
 * 返回第一次找到的下标，不存在返回负数
 * static int[] copyOf(int[] original, int newLength) ：根据original原数组复制一个长度为
 * newLength的新数组，并返回新数组
 * static int[] copyOfRange(int[] original, int from, int to) ：复制original原数组的[from,to)构成新
 * 数组，并返回新数组
 * static boolean equals(int[] a, int[] a2) ：比较两个数组的长度、元素是否完全相同
 * static void fill(int[] a, int val) ：用val填充整个a数组
 * static void fill(int[] a, int fromIndex, int toIndex, int val)：将a数组[fromIndex,toIndex)部分填充
 * 为val
 * static void sort(int[] a) ：将a数组按照从小到大进行排序
 * static void sort(int[] a, int fromIndex, int toIndex) ：将a数组的[fromIndex, toIndex)部分按照升
 * 序排列
 * static String toString(int[] a) ：把a数组的元素，拼接为一个字符串，形式为：[元素1，元素2，元
 * 素3。。。]
 */
public class ArraysDemo {
    @Test
    public void test(){
        int[] arr = {8,943,3,2,12,56,77,221,44};
        int[] arr2 = {8,943,3,2,12,56,77,221,44};
//        static void sort(int[] a) ：将a数组按照从小到大进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        static void sort(int[] a, int fromIndex, int toIndex) ：将a数组的[fromIndex, toIndex)部分按照升
//                序排列
//        Arrays.sort(arr,0,5);
//        System.out.println(Arrays.toString(arr));
//        static int binarySearch(int[] a, int key) ：要求数组有序，在数组中查找key是否存在，如果存在
//        返回第一次找到的下标，不存在返回负数
        System.out.println(Arrays.binarySearch(arr, 22));
//        static int[] copyOf(int[] original, int newLength) ：根据original原数组复制一个长度为
//        newLength的新数组，并返回新数组
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 5)));
//        static int[] copyOfRange(int[] original, int from, int to) ：复制original原数组的[from,to)构成新
//        数组，并返回新数组
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 5,8)));
//        static boolean equals(int[] a, int[] a2) ：比较两个数组的长度、元素是否完全相同
        System.out.println(Arrays.equals(arr, arr2));
//        static void fill(int[] a, int val) ：用val填充整个a数组
        Arrays.fill(arr2,99);
        System.out.println(Arrays.toString(arr2));
//        static void fill(int[] a, int fromIndex, int toIndex, int val)：将a数组[fromIndex,toIndex)部分填充
//                为val
        Arrays.fill(arr2,0,5,88);
        System.out.println(Arrays.toString(arr2));
//        static String toString(int[] a) ：把a数组的元素，拼接为一个字符串，形式为：[元素1，元素2，元
//        素3。。。]

        System.out.println(Arrays.toString(arr));
    }
}
