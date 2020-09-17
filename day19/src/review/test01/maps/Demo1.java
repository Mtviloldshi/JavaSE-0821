package review.test01.maps;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/14:49
 * @Description:
 */
public class Demo1 {
    public static void main(String[] args){
        Map<String,List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list.add("杭州");
        list.add("温州");
        list2.add("北京");
        list3.add("上海");

        map.put("浙江",list);
        map.put("北京",list2);
        map.put("上海",list3);

        Set<String> set = map.keySet();

        for(String key : set){
            System.out.println(key);
            List<String> values = map.get(key);
            for(String value : values){
                System.out.println(" " + value);
            }
        }
    }
}
