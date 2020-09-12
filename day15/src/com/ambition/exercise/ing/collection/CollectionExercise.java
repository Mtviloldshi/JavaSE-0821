package com.ambition.exercise.ing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/17:59
 * @Description:
 * 1、用一个String[]数组存点数
 * 2、用一个String[]数组存花色
 * 3、用一个String[]数组存大王、小王
 * 4、用上面的数组，生成一副扑克牌，放到Collection的集合中
 * 5、遍历显示全副扑克牌
 *
 * 6、模拟给4个人随机发牌，每个人11张牌，分别放到四个Collection集合中
 * 7、显示每个人的牌和剩余的牌
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"黑桃", "红桃", "方片", "梅花"};
        String[] gui = {"大王", "小王"};
        for (int i = 0; i < number.length; i++) {//循环点数
            for (int j = 0; j < 4; j++) {//循环花数
                coll.add(color[j] + number[i]);//添加普通点数扑克牌
                if (number.length-1 == i && j == 3){//添加完普通扑克牌时
                    for (int k = 0; k < 2; k++) {//添加大小王
                        coll.add(gui[k]);
                    }
                }
            }

        }
        //遍历
        int count = 0;
        for (Object s : coll) {
            String str = (String)s;
            System.out.print(s + "\t");
            count++;
            if (count % 8 == 0){
                System.out.println();
            }
        }

        // * 6、模拟给4个人随机发牌，每个人11张牌，分别放到四个Collection集合中
        Collection coll1 = new ArrayList();
        Collection coll2 = new ArrayList();
        Collection coll3 = new ArrayList();
        Collection coll4 = new ArrayList();
        //集合转数组
        Object[] objects = coll.toArray();
        //向下转型
//        String[] str2 = (String[]) objects;
        Random random = new Random();
        for (int i = 0; i < 44; i++) {
            //获得随机角标
            int i1 = random.nextInt(objects.length);
            //依次放11张牌
            if (i <= 10){
                coll1.add(objects[i1]);
            }else if (i >= 11 && i <= 21){
                coll2.add(objects[i1]);
            }else if(i >= 22 && i <= 32){
                coll3.add(objects[i1]);
            }else {
                coll4.add(objects[i1]);
            }
        }
        System.out.println();
        // * 7、显示每个人的牌和剩余的牌
        System.out.print("第一个人:" + coll1 + "\n");
        System.out.print("第一个人:" + coll2 + "\n");
        System.out.print("第一个人:" + coll3 + "\n");
        System.out.print("第一个人:" + coll4 + "\n");
    }
}
