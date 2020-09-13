package com.ambition.demo.treemap2;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/10:40
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(110,"baojin");
        map.put(120,"jijiu");
        map.put(119,"huojing");
        map.put(114,"huojing");
        for (Integer key : map.keySet()) {
            System.out.println(key + map.get(key));
        }
    }
}
