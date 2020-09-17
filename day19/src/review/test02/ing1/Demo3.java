package review.test02.ing1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/17/11:21
 * @Description:
 *
 *      求出一个字符串中出现次数最多的 字母 如果有多个一并求出
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = "skskfmdljfdljlkgzlkczx";
        Map<String,Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();//字符串转数组
        for (int i = 0; i < chars.length; i++) {
            int count = 0;//记录字母出现次数
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]){
                    count++;
                }
            }
            map.put(String.valueOf(chars[i]),count);
        }

        Set<String> strings = map.keySet();
        int max = 0;
        for (String key : strings) {
            if (map.get(key) > max){
                max = map.get(key);
            }
        }

        System.out.println("出现次数最多字母：");
        for (String key : strings) {
            if (map.get(key) == max){
                System.out.println(key + ":" + map.get(key) + "次");
            }
        }

//        System.out.println(max);
    }
}
