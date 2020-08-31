package com.ambition.method3;

/*
    可变参数
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(add(10, 20, 50, 30));
        calc("*", 1, 2, 3, 4, 5);
        int[][] arr = {{1, 2, 3}};
        numbers(arr);
    }

    //可变参数
    public static int add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void calc(String s, int... a) {
        if (s.equals("+")) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            System.out.println(sum);
        } else if (s.equals("*")) {
            int sum = 1;
            for (int i = 0; i < a.length; i++) {
                sum *= a[i];
            }
            System.out.println(sum);
        } else {
            System.out.println("输入错误");
        }
    }

    public static void numbers(int[][]... a) {
        System.out.println(a);
    }
}
