package com.ambition.demo.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/15:09
 * @Description:
 *  TreeSet:元素唯一，可排序(元素可以比较)
 *
 */
public class Demo {
    public static void main(String[] args) {
        //创建树形集合对象
        Set<Integer> set = new TreeSet<>();
        set.add(17);
        set.add(7);
        set.add(70);
        set.add(18);
        set.add(81);
        set.add(8);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
