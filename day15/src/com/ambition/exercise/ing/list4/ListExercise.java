package com.ambition.exercise.ing.list4;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/20:16
 * @Description:
 * 1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 * 2、创建集合，集合存放随机生成的30个小写字母
 * 3、用listTest统计，某些元素的出现次数
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random();
        String[] characters = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "u", "x", "y", "z", "v", "t", "r",
                "s", "w"};
        for (int i = 0; i < 30; i++) {
            int number = random.nextInt(characters.length);
            list.add(characters[number]);
        }
        System.out.println("原字符串：" + list);
        int count = listTest(list, "sd");
        System.out.println("出现次数：" + count);
    }

    public static int listTest(Collection list, String s) {
       // 1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
        ArrayList arr = (ArrayList)list;
        int count = 0;
        Iterator iterator = arr.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(s)){
                iterator.remove();
                count++;
            }
        }

        return count;
    }
}
