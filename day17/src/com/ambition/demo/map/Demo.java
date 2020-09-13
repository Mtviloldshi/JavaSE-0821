package com.ambition.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/9:01
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(1,"2");
        map.put(2,"3");
        map.put(3,"4");
        map.put(4,"5");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println("key" + key + "-----------" + "value" + value);
        }
        System.out.println("-------------------");
        //遍历所有key
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            String value = map.get(integer);
            System.out.println(integer + " = " + value);
        }
    }

}
