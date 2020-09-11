package com.ambition.exercise.text.tes1iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/14:40
 * @Description:
 *  public E next() :返回迭代的下一个元素。
 * public boolean hasNext() :如果仍有元素可以迭代，则返回 true。
 * public void remove() :通过迭代器删除元素
 */
public class IteratorDemo {
    @Test
    public void test(){
        Collection<String> coll = new ArrayList<>();
        coll.add("iterator1");
        coll.add("iterator2");
        coll.add("iterator3");
        //获取集合对应的迭代器实例
        Iterator<String> next = coll.iterator();
        //判断是否有迭代元素
        while (next.hasNext()){
            System.out.println(next.next());//取出迭代元素
        }
    }
}
