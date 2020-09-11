package com.ambition.exercise.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/18:15
 * @Description: 请使用Math 相关的API，计算在 -10.8 到5.9 之间，绝对值大于6 或者小于2.1 的整数有多少个？
 */
public class MathExercise {
    public static void main(String[] args) {
        int count = 0;
        for (double i = Math.ceil(-10.8); i < 5.9; i ++) {
            if (Math.abs(i) < 2 || Math.abs(i) > 6) {
                count++;
            }
        }
        System.out.println(count);
    }
}
