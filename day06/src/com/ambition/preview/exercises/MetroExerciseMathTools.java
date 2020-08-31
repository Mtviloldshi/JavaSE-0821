package com.ambition.preview.exercises;

/*
    1. 声明数学工具类MathTools
        （1）静态方法1：可以比较两个整数是否相同 （2）静态方法2：可以判断某个数是否是素数
        （3）静态方法3：可以返回某个整数所有的约数（约数：从1到这个数之间所有能把它整除的数）
        在Test测试类的main中调用测试
 */
public class MetroExerciseMathTools {

    //比较两个整数是否相等
    static boolean twoNumber(int a, int b) {
        return a == b ? true : false;
    }

    //判断某个数是否是素数
    static String isPrimeNumber(int a) {
        if (a > 1) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return "是素数";
            } else {
                return "不是素数";
            }
        }
        return "输入错误";
    }

    //返回某个值的所有约数
    static void getApproximateNumber(int number) {
        System.out.print(number + "的因数有：");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print("\t" + i);
            }
        }
    }
}
