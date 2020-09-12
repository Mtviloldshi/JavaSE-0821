package com.ambition.exercise.ing;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/17:57
 * @Description:
 *
 * 2. ### 练习3
 *    随机产生几个100以内的偶数，存放到一个Set中，并且遍历显示它们，保证最后Set中有10个元素
 */
public class SetExercise2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (;;){
            int number = random.nextInt(100);
            if (number % 2 == 0){
                set.add(number);
            }
            if (set.size() == 10){
                break;
            }
        }
        System.out.println(set);
    }
}
