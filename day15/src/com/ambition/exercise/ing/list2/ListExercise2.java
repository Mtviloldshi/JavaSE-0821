package com.ambition.exercise.ing.list2;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/19:03
 * @Description:
 * 1、随机生成10个[1,100]之间的整数，放到List集合中，遍历显示
 * 2、找出前3名最大值，删除它们，注意可能重复
 * 3、显示删除后的结果
 */
public class ListExercise2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random();

        for (;;){
            int number = (int)(random.nextInt(100) + 1);
            list.add(number);
            if (list.size() == 10){
                break;
            }
        }

        //从到到小排序
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer num1 = (Integer)o1;
                Integer num2 = (Integer)o2;
                return num2 - num1;
            }
        });
        System.out.println("10个随机数：" + list);
        //删除元素
        List list1 = list.subList(0,3);
        System.out.println("三个最大的：" + list1);
        System.out.println("删除之后元素：" + list.subList(3,10));
    }
}
