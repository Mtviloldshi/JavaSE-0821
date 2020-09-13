package com.ambition.exercise.ing2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/19:03
 * @Description:
 * 写一个字符串 统计各个字母出现的次数
 */
public class Demo1 {
    public static void main(String[] args) {
        String str = ".sjaskja skjfaskj]";
        Map<Character,Integer> ziMu = getZiMu(str);
        for (Character key : ziMu.keySet()) {
           Integer value = ziMu.get(key);
            System.out.println(key + ":" + value + "次");
        }
    }
    public static Map<Character,Integer> getZiMu(String str){
        String trim = str.trim();
        Map<Character,Integer> map = new HashMap<>();
                                    //替换标点符号和空格
        str = str.replaceAll("\\.|\\[|\\]|\\'| ", "");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            //利用map key的唯一性
            map.put(str.charAt(i),count);
        }

        return map;
    }
}
