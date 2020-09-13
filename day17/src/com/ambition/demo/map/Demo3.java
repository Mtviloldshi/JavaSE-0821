package com.ambition.demo.map;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/10:02
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Map<Integer,String>> list = new ArrayList<>();
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        Map<Integer,String> map3 = new HashMap<>();
        map1.put(1,"aaa");
        map1.put(2,"bbb");
        map1.put(3,"ccc");
        map2.put(4,"ddd");
        map2.put(5,"eee");
        map2.put(6,"fff");
        map3.put(7,"ggg");
        map3.put(8,"hhh");
        map3.put(9,"iii");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        Iterator<Map<Integer, String>> iterator = list.iterator();
        while (iterator.hasNext()){
            Map<Integer, String> next = iterator.next();
            Set<Map.Entry<Integer, String>> entries = next.entrySet();
            Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
            while (iterator1.hasNext()){
                Map.Entry<Integer, String> next1 = iterator1.next();
                Integer key = next1.getKey();
                String value = next1.getValue();
                System.out.println(key + "==" + value);
            }
        }
    }
}
