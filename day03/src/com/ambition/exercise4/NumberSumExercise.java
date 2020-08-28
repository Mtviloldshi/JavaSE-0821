package com.ambition.exercise4;

/*
    第1题：累加和
    1、求1-100的和
 */
public class NumberSumExercise {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("1-100的和= " + sum);
    }
}
