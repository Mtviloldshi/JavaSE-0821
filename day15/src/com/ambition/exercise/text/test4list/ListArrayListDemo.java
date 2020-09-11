package com.ambition.exercise.text.test4list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/18:52
 * @Description: List ArrayList API的用法
 *
 *  List ArrayList特点 底层数组存储，查找快，增删慢
 *      List集合特有的方法都是跟索引相关
 *
 *  1、添加元素
 * void add(int index, E ele)
 * boolean addAll(int index, Collection<? extends E> eles)
 * 2、获取元素
 * E get(int index)
 * List subList(int fromIndex, int toIndex)
 * 3、获取元素索引
 * int indexOf(Object obj)
 * int lastIndexOf(Object obj)
 * 4、删除和替换元素
 * E remove(int index)
 * E set(int index, E ele)
 */
public class ListArrayListDemo {
    @Test
    public void test2(){
        //实例化List对象
        ArrayList<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list3");
        list.add("list3");
//        3、获取元素索引
// * int indexOf(Object obj) 获取指定元素索引，从前往后查找，返回找到的第一个元素索引角标
        System.out.println(list.indexOf("list3"));
// * int lastIndexOf(Object obj) 获取指定位置索引，从后往前找，返回找到的第一个元素索引角标
        System.out.println(list.lastIndexOf("list3"));
//        4、删除和替换元素
// * E remove(int index) 删除指定位置元素，返回被删除的元素。或者删除指定元素
        System.out.println(list.remove(2));
        System.out.println(list.remove("list3"));//删除指定元素，先查找指定元素，找到返回true 否则false
        System.out.println(list);
// * E set(int index, E ele)//修改指定位置元素，返回被修改元素
        String setlist = list.set(0, "setlist");
        System.out.println(setlist);//被修改元素
        System.out.println(list);
    }
    @Test
    public void test1(){
        //实例化List对象
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        //2、获取元素 指定位置
        // * E get(int index)
        System.out.println(list.get(2));
        // * List subList(int fromIndex, int toIndex)
        //获取指定范围内数据，返回同类型集合[0,1)
        List<String> list1 = list.subList(0, 1);
        System.out.println(list1);
    }
    @Test
    public void test(){
        //实例化List对象
        List<String> list = new ArrayList<>();
//   1、添加元素
// * void add(int index, E ele)
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list4");
        list.add("list5");
        //添加指定位置元素 ,不能超过集合长度，集合长度内，指定位置元素往后移
        list.add(3,"list10");
        System.out.println(list);
// * boolean addAll(int index, Collection<? extends E> eles)
        Collection<String> coll = new ArrayList<String>();
        coll.add("coll1");
        coll.add("coll2");
        //添加指定位置，集合
        list.addAll(3,coll);
        System.out.println(list);
    }
}
