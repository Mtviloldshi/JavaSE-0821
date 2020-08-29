package com.ambition.demo;
/*
    空指针异常
 */
public class NullPointException_demo5 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        System.out.println(arr[0].length);//Exception in thread "main" java.lang.NullPointerException
    }
}
