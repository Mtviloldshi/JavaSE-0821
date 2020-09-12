package com.ambition.exercise.ing4;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/18:17
 * @Description:
 * 案例：双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33
 * 中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //实例化装红色球号码集合
        HashSet<Integer> set = new HashSet<>();//底层是hash表 查询和增删都快快
        //实例化装蓝色球号码集合
        LinkedList<Integer> set1 = new LinkedList<>();//底层是双向链表查询慢 增删快
        Random random = new Random();
        for (;;){
            //产生红球随机数号码
            int number = random.nextInt(33) + 1;
            //放入集合
            set.add(number);
            if (set.size() == 6){
                //产生蓝球随机数号码
                number = random.nextInt(16) + 1;
                //放入装蓝球号码集合
                set1.add(number);
                break;
            }
        }
        //实例化可重复集合，将号码放入其中
        ArrayList list = new ArrayList<>();
        //添加集合
        list.addAll(set);
        list.addAll(set1);
        System.out.println("本期双色球号码为：" + list);
        System.out.println("红色号码：" + set + "\t" + "篮色号码：" + set1);
    }
}
