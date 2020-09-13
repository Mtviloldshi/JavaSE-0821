package com.ambition.exercise.ing6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/20:26
 * @Description: （1）从键盘输入一个年份，输出该年的世界杯冠军是哪支球队。如果该年没有举办世界杯，则输出：
 * 没有举办世界杯。
 * （2）从键盘输入一支球队的名字，输出该球队夺冠的年份列表。 例如，读入“巴西”，应当输出 1958
 * 1962 1970 1994 2002 读入“荷兰”，应当输出 没有获得过世界杯
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        System.out.print("请输入一个年份:");
        int year = scan.nextInt();
        Set<Integer> set = map.keySet();
        boolean flag = false;
        for (Integer key : set) {
            if (year == key) {
                flag = true;
                System.out.println(key + "年，获得世界杯冠军的是" + map.get(key));
                break;
            }
        }
        if (flag == false) {
            System.out.println(year + "年，没有举办世界杯");
        }
        System.out.println("请输入一个国家名称：");
        String name = scan.next();
        int i = 1;
        for (Integer key : set) {
            flag = false;
            if (name.equals(map.get(key))) {
                flag = true;
                if (i == 1)
                    System.out.println("该球队在如下年份获得过冠军：");
                i = 0;
                System.out.println(key);
            }
        }
        if (flag == false) {
            System.out.println("不存在这个国家！");
        }
    }
}
