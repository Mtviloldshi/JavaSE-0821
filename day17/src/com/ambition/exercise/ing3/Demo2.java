package com.ambition.exercise.ing3;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/19:48
 * @Description:
 *
 * 添加你喜欢的歌手以及你喜欢他唱过的歌曲
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list,"<<七里香>>","<<晴天>>","<<稻香>>");
        Collections.addAll(list2,"<<修炼爱情>>","<<不为谁而作的歌>>","<<江南>>");
        map.put("周杰伦",list);
        map.put("林俊杰",list2);
        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        Iterator<Map.Entry<String, List<String>>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<String>> next = iterator.next();
            System.out.print(next.getKey() + ":");
            Iterator<String> iterator1 = next.getValue().iterator();
            while (iterator1.hasNext()){
                String next1 = iterator1.next();
                System.out.print(next1 + "\t");
            }
            System.out.println();
        }
    }
}
