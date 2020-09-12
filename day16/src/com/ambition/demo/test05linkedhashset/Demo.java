package com.ambition.demo.test05linkedhashset;

import java.util.LinkedHashSet;

/**
 *
 * @Author: ambitions
 * @Date: 2020/09/12/14:47
 * @Description:
 *  LinkedHashSet:元素有序
 */
public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("123");
        set.add("122");
        set.add("124");
        set.add("134");
        System.out.println(set);
    }
}
