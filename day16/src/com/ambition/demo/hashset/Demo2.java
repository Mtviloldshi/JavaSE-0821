package com.ambition.demo.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/11:50
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java ");
        set.add("jack ");
        System.out.println(set );
    }
}
