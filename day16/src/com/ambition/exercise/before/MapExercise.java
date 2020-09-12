package com.ambition.exercise.before;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/20:58
 * @Description:
 *
 * （1）从键盘输入本组学员的姓名和他的手机号码，存放到map中，姓名为key,手机号码为value，
 * 并且遍历显示
 * （2）再从键盘输入姓名，查询他的手机号码
 */
public class MapExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        map.put("lhq",123456);
        map.put("lhq1",1234567);
        map.put("lhq2",1234568);
        map.put("lhq3",1234569);
        System.out.println("请输入姓名:");
        String name = scan.next();
        Integer integer = map.get(name);
        if (integer != null){
            System.out.println(name + "电话号码为：" + integer);
        }else {
            System.out.println("未找到此用户!!!");
        }
    }
}

