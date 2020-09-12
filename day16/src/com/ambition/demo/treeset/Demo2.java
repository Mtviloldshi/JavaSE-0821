package com.ambition.demo.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/15:11
 * @Description:
 */
public class Demo2 {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("c");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
