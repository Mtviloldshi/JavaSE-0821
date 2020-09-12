package com.ambition.demo.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/10:58
 * @Description:
 * Iterator 迭代器：可以遍历所有实现Collection下面的实现类集合
 */
public class DemoIterator {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("oqo");
        coll.add("oqo");
        coll.add("oqo");
        Iterator iterator = coll.iterator();

        // E next() //获取下一个元素，并且指向下一个
        System.out.println(iterator.next());
        //boolean hasNext() 判断是否有下一个元素
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // void remove() //删除一个元素
    }
}
