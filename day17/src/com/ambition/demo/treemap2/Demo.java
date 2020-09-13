package com.ambition.demo.treemap2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/10:37
 * @Description:
 *
 * LinkedHashMap:底层双向链表 保证了元素的顺序
 */
public class Demo {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(111,"abc");
        map.put(222,"dd");
        map.put(333,"dd");
        map.put(1444,"addbc");

        Set set = map.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
