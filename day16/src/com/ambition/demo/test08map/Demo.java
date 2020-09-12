package com.ambition.demo.test08map;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/16:26
 * @Description:
 *
 */
public class Demo {
    public static void main(String[] args) {
        Map map = new HashMap();

        //添加数据
        map.put(101,"tom4");
        map.put(102,"tom1");
        map.put(103,"tom2");
        map.put(104,"tom3");

        //添加集合 putAll(Map map)
        //清空集合 clear()
        //删除 remove(key) 返回value
        //查询 ：
            //V get(key) 根据key删除元素 返回value值
            //包含 boolean containsKey(key)是否包含这个key 返回boolean
            //包含 boolean containsValue(key)是否包含这个value 返回boolean
            //boolean isEmpty() 判断是否为空

//        Set keySet()//所有的key转换为Set集合
        Set set = map.keySet();
        System.out.println(set);
//      Collection values() //把所有的值转换为Collection集合
        Collection values = map.values();
        System.out.println(values);
//      Set<Map.Entry<K,V>> entrySet() //获取所有的
        Set set1 = map.entrySet();
//        System.out.println(set1);
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(map);
    }
}
