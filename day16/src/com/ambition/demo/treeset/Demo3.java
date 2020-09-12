package com.ambition.demo.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/15:14
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(3);
        set.add(21);
        set.add(32);
        System.out.println(set);
    }
}
