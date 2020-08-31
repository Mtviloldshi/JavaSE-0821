package com.ambition.method2.exercise;

public class MethodTools {
    //判断某个数是否是素数
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 0; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //输出某个数的所有约数
    public static int[] isNumber(int num) {
        int[] arr = new int[num/2];
        int i = 0;
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                arr[i] = j;
                i++;
            }
        }
        int[] newArr = new int[i];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = arr[j];
        }
        arr = newArr;
        return arr;
    }
}
