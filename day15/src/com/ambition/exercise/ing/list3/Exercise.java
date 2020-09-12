package com.ambition.exercise.ing.list3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/19:37
 * @Description:
 * 随机生成30个数，范围2-100，获取其中的质数。
 */
public class Exercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Random random = new Random();
        for (;;){
            int number = (int)(random.nextInt(98) + 2);
            list.add(number);
            if(list.size() == 30){
                break;
            }
        }
        System.out.println("30个随机数:" + list);

        int i = 0;
        while (i < list.size()){
            for (int j = 2; j < list.get(i); j++) {
                if (list.get(i) % j == 0){
                    list.remove(i);
                    i--;
                    break;
                }
            }
            i++;
        }

        System.out.println("30个随机数的质数有：" + list);
    }
}
