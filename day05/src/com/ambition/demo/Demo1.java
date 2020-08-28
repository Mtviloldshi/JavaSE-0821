package com.ambition.demo;

/*
    4.7.1 统计
        求数组元素的总和、均值、统计偶数个数等
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {21, 2, 56, 77, 99};
        int sum = 0,j = 0;//初始化变量

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] % 2 == 0){
                j++;
            }
        }

        double avg = (double) (sum / arr.length);//强转
        System.out.println("数组总和：" + sum);
        System.out.println("数组总和平均值：" + avg);
        System.out.println("数组偶数个数：" + j);
    }
}
