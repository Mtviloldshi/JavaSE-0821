package com.ambition.demo.test4list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/14:35
 * @Description:
 *
 * 随机产生10个100以内的偶数，存放到一个List中，并且遍历显示它们
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();

        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
            int i1 = random.nextInt(99);
            if (i1 % 2 == 0 && list.size() < 10){
                list.add(i1);
            }
            if (list.size()==10){
                break;
            }
        }
        for (Object o : list) {
            System.out.print(o + "\t");
        }
        System.out.println("\n" + count);

    }
}
