package com.ambition.exercise.before.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/16:55
 * @Description:
 *
 * 随机产生10个100以内的偶数，存放到一个Set中，并且遍历显示它们
 */
public class SetExercise {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (;;){
           int num =  (int)(Math.random() * 100);
           if (num % 2 == 0){
               set.add(num);
           }
           if (set.size() > 9){
               break;
           }
        }
        for (Object o : set) {
            System.out.print(o + "\t");
        }
    }
}
