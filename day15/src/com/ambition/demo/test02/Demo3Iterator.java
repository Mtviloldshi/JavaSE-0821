package com.ambition.demo.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/11:23
 * @Description:
 *
 * 一个类如果实现了Iterable接口，就可以使用
 *  增强for循环进行遍历
 *
 *  fail - fast机制：快速失败机制，再通过迭代器获取元素，next(),每次会检查modcount(集合修改次数)，不等于0，
 *  则抛异常
 *      java.util.ConcurrentModificationException
 *
 *      遍历时操作元素
 *          1.iterator 获取和删除元素
 *          2.普通for循环 集合自身操作
 */
public class Demo3Iterator {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(123);
        coll.add(123);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){//java.util.ConcurrentModificationException//并发修改异常
            if (iterator.next() == Integer.valueOf(123)){
//                coll.remove(iterator.next());
                iterator.remove();
            }
        }
    }
}
