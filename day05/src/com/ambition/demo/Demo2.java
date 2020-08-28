package com.ambition.demo;

/*
    4.7.2 查找指定元素
    查找某个指定元素在数组中的首次出现的位置（索引）
    常见查找算法有顺序查找，二分查找（折半查找，前提要求数组中元素是按照大小顺序排序的）
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {21, 2, 56, 77, 99};
        int num = 1;

        int index = -1;//默认值-1，表示未找到
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){//找到匹配数字
                index = i;//记录元素位置
                break;//跳出循环
            }
        }
        System.out.println(index);
    }
}
