package com.ambition.exercise.ing.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/18:49
 * @Description:
 *
 * 模拟乐透号码。
 * 随机生成10个号码放到集合中，范围1-50，作为乐透号码。不能重复。
 * 键盘录入10个整数放到集合中，范围1-50，不能重复。
 * 录入的整数与乐透号码对比，统计猜中了几个。
 */
public class ListExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        //实例化随机数
        Random random = new Random();
        int number = 0;
        for (int i = 0; i < 10; i++) {
            //生成随机数
            number = (int)(random.nextInt(47) + 1);
            //添加进集合
            list.add(number);
        }

        System.out.println("乐透号码已生成，游戏开始：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("请输入第" + (i + 1) + "个数字[1-50]:");
            list2.add(scan.nextInt());
        }
        
        System.out.println("您输入的号码为：" + list2);
        System.out.println("乐透号码为：" + list);
        list.retainAll(list2);
        System.out.println("相同号码为：" + list);
        System.out.println("猜中了" + list.size() + "个数字");
    }
}
