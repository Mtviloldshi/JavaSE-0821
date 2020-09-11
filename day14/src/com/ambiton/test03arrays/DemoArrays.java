package com.ambiton.test03arrays;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/14:04
 * @Description:
 *
 * ava.util.Arrays数组工具类，提供了很多静态方法来对数组进行操作，而且如下每一个方法都有各种重
 * 载形式，以下只列出int[]类型的，其他类型的数组类推：
 * static int binarySearch(int[] a, int key) ：要求数组有序，在数组中查找key是否存在，如果存在
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
 * static String
 */
public class DemoArrays {
}
