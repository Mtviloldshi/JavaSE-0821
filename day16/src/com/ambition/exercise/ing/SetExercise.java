package com.ambition.exercise.ing;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/16:48
 * @Description:
 *
 *      1. ### 练习2
 *    随机产生10个100以内的偶数，存放到一个Set中，并且遍历显示它们
 */
public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        int count = 0;
        for (;;){
            int number = random.nextInt(100);
            if (number % 2 == 0){
                count++;
                set.add(number);
            }
            if (count == 10){
                break;
            }
        }
        System.out.println(set);
    }
}
