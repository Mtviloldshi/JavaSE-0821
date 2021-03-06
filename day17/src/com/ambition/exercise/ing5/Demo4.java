package com.ambition.exercise.ing5;

import java.util.*;

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
public class Demo4 {
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
        Set coll1 = new TreeSet<>();
        Set coll2 = new TreeSet<>();
        Set coll3 = new TreeSet<>();
        Set coll4 = new TreeSet<>();
        Set coll5 = new TreeSet<>();
        //装随机数
        Collection<Integer> colls = new ArrayList();
        //集合转数组
        Object[] objects = coll.toArray();
        //向下转型
//        String[] str2 = (String[]) objects;
        Random random = new Random();
        int i = 0,counts = 0;
        for (;;) {
            counts++;
            //获得随机角标
            int i1 = random.nextInt(objects.length);
            //判断当前装随机数的集合是否包含了这个随机数，如果没包含，就添加
            if (!colls.contains(i1)){
                colls.add(i1);
                //依次放11张牌
                if (i <= 12){
                    coll1.add(objects[i1]);
                }else if (i >= 13 && i <= 25){
                    coll2.add(objects[i1]);
                }else if(i >= 26 && i <= 38){
                    coll3.add(objects[i1]);
                }else if (i >= 40 && i <= 52){
                    coll4.add(objects[i1]);
                }else {
                    coll5.add(objects[i1]);
                }
                i++;
                //牌已被取完，跳出循环
                if (i == objects.length){
                    break;
                }
            }
        }
        System.out.println();
        // * 7、显示每个人的牌和剩余的牌 排序后的牌
        System.out.print("左边:" + coll1 + "\n");
        System.out.print("右边:" + coll2 + "\n");
        System.out.print("上边:" + coll3 + "\n");
        System.out.print("下边:" + coll4 + "\n");
        System.out.print("底牌:" + coll5 + "\n");
        System.out.println("总共循环了：" + counts);
    }
}
