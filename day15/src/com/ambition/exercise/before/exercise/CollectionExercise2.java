package com.ambition.exercise.before.exercise;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/17:34
 * @Description:
 *
 * 添加100以内的质数到Collection的某个集合中
 *  * 使用foreach遍历
 *  * 使用Iterator遍历，并删除个位数是3个质数
 *  * 删除11
 *  * 查看最后剩下几个元素
 *
 *  添加10个100以内的随机整数到另一个Collection的集合中
 *  查看他们的交集
 */
public class CollectionExercise2 {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
//        添加100以内的质数到Collection的某个集合中
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                }
            }
            if (flag){
                coll.add(i);
            }
        }
        //实例化 iterator迭代器
        Iterator<Integer> iterator = coll.iterator();
        //判断下一个数据是否为空
        while (iterator.hasNext()){
            //判断是否个位数为0
            if (iterator.next() % 10 == 3){
                //如果是，删除掉
                iterator.remove();
            }
        }

//        删除11
        coll.remove(new Integer(11));
        //查看最后剩下几个元素
        System.out.println("元素个数: " + coll.size());

//        添加10个100以内的随机整数到另一个Collection的集合中
        Collection<Integer> coll2 = new ArrayList<>();
        //实例化随机数对象
        Random random = new Random();
        //添加随机数
        for (int i = 0; i < 10; i++) {
            coll2.add(Integer.valueOf(random.nextInt(99)));
        }

        System.out.println("coll");
        //for each循环
        for (Integer num :
                coll) {
            System.out.print(num + "\t");
        }

        System.out.println("\ncoll2");
        //for each循环
        for (Integer num :
                coll2) {
            System.out.print(num + "\t");
        }
        // *        查看他们的交集
        coll.retainAll(coll2);
        System.out.println("\n交集");
        for (Integer num :
                coll) {
            System.out.print(num + "\t");
        }
    }
}
