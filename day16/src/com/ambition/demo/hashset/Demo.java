package com.ambition.demo.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/11:46
 * @Description:
 *  Set接口的实现类的特点：元素唯一
 *          HashSet:存储数据顺序不一致-->无序
 *
 *  HashSet底层到底根据什么判断两个元素是否相同？
 *      1.比较两个对象的hashCode值
 *      2.比较使用两个对象的equals方法
 *      如果以上两种都相同则视为同一个对象
 *  尽量让两个相同对象的hash值也相同（一定相同）
 *  让两个对象内容不相同，hash值也不同（不一定不同）
 */
public class Demo {
    public static void main(String[] args) {
        //实例化Set对象
        Set<Integer> set = new HashSet<>();
        //添加元素
        set.add(123);
        set.add(12);
        set.add(13);
        set.add(23);
        set.add(23);
        set.add(new Integer(400));
        set.add(new Integer(400));
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
