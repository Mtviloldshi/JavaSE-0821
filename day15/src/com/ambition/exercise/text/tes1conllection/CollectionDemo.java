package com.ambition.exercise.text.tes1conllection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/13:54
 * @Description:
 *
 * 1、添加元素
 * （1）add(E obj)：添加元素对象到当前集合中
 * （2）addAll(Collection<? extends E> other)：添加other集合中的所有元素对象到当前集合中，即this
 * = this ∪ other
 * 2、删除元素
 * （1） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元
 * 素。
 * （2）boolean removeAll(Collection<?> coll)：从当前集合中删除所有与coll集合中相同的元素。即this
 * = this - this ∩ coll
 * 3、判断
 * （1）boolean isEmpty()：判断当前集合是否为空集合。
 * （2）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元
 * （3）boolean containsAll(Collection<?> c)：判断c集合中的元素是否在当前集合中都存在。即c集合是
 * 否是当前集合的“子集”。
 * 素。
 * 4、获取元素个数
 * （1）int size()：获取当前集合中实际存储的元素个数
 * 5、交集
 * （1）boolean retainAll(Collection<?> coll)：当前集合仅保留与c集合中的元素相同的元素，即当前集
 * 合中仅保留两个集合的交集，即this = this ∩ coll；
 * 6、转为数组
 * （1）Object[] toArray()：返回包含当前集合中所有元素的数组
 */
public class CollectionDemo {
    @Test
    public void test4(){
        Collection collection = new ArrayList();
        Collection collection2 = new ArrayList();
        collection.add("collection1");
        collection.add("collection2");
        collection.add("collection3");
        collection2.add("collection4");
        collection2.add("collection5");
        //coll.add(coll2)//coll2为一个整体元素，不管这个整体有多少元素，coll长度始终只加1 coll总长度 = coll.size() + 1
//        collection.add(collection2);
//        System.out.println(collection.size());
//        for (Object c :
//                collection) {
//            System.out.println(c);
//        }

        //coll.addAll(coll2) coll2里元素依次往coll添加 coll总长度 = coll.size() + coll2.size()
        collection.addAll(collection2);
        System.out.println(collection.size());
        for (Object o :
                collection) {
            System.out.println(o);
        }

    }
    @Test
    public void test3(){
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        collection.add("collection1");
        collection.add("collection2");
        collection.add("collection3");
        collection2.add("collection4");
        collection2.add("collection5");
        //（1）int size()：获取当前集合中实际存储的元素个数
        System.out.println(collection.size());
        //（1）boolean retainAll(Collection<?> coll)：当前集合仅保留与c集合中的元素相同的元素，即当前集
        // * 合中仅保留两个集合的交集，即this = this ∩ coll；
        System.out.println(collection.retainAll(collection2));
        //（1）Object[] toArray()：返回包含当前集合中所有元素的数组
        Object[] objects = collection2.toArray();
        for (Object str :
                objects) {
            System.out.println(str);
        }
    }

    @Test
    public void test2(){
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        collection.add("collection1");
        collection.add("collection2");
        collection.add("collection3");
        collection2.add("collection2");
        collection2.add("collection3");
        // * （1）boolean isEmpty()：判断当前集合是否为空集合。
        boolean empty = collection.isEmpty();
        System.out.println(empty);
        // * （2）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元
        boolean contains = collection2.contains("collection3");
        System.out.println(contains);
        //（3）boolean containsAll(Collection<?> c)：判断c集合中的元素是否在当前集合中都存在。即c集合是
        //否是当前集合的“子集”。
        System.out.println(collection.containsAll(collection2));
    }

    @Test
    public void test1(){
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        collection.add("collection1");
        collection.add("collection2");
        collection.add("collection3");
        collection2.add("collection2");
        collection2.add("collection3");
       // * （1） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        boolean b = collection.remove("collection1");
        System.out.println(b);
        boolean b2 = collection.remove("collection");
        System.out.println(b2);
        // * （2）boolean removeAll(Collection<?> coll)：从当前集合中删除所有与coll集合中相同的元素。即this= this - this ∩ coll
        boolean b1 = collection.removeAll(collection2);
        System.out.println(b1);
        for (String str :
                collection) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        //1）add(E obj)：添加元素对象到当前集合中
        collection.add("collection1");
        collection.add("collection2");
        collection.add("collection3");
        //（2）addAll(Collection<? extends E> other)：添加other集合中的所有元素对象到当前集合中，即this
        // * = this ∪ other
        //
        collection2.addAll(collection);
        //for each遍历集合
        for (String s: collection2) {
            System.out.println(s);
        }
    }
}
