package com.ambition.demo;

public class DemoArray6 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;

        int[] arr2 = new int[2];
        arr2 = arr;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
