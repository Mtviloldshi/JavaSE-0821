package com.ambition.exercise.ing4;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/19:57
 * @Description:
 *  添加如下省份与城市信息到map中，并遍历显示
 */
public class Demo3 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list,"杭州","嘉兴","温州");
        Collections.addAll(list2,"武汉","黄石","大冶");
        map.put("浙江",list);
        map.put("湖北",list2);

        for (String key : map.keySet()) {
            System.out.println(key);
            Iterator<String> iterator = map.get(key).iterator();
            while (iterator.hasNext()){
                System.out.println("\t" +iterator.next());
            }
        }
    }
}
