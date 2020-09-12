package com.ambition.demo.test02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/11:48
 * @Description:
 * 添加100以内的质数到Collection的某个集合中
 * 使用foreach遍历
 * 使用Iterator遍历，并删除个位数是3个质数
 * 删除11
 * 查看最后剩下几个元素
 */
public class Exercise {
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        for (int i = 2; i < 100; i++) {
            boolean isflag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isflag = false;
                }
            }
            if (isflag){
                coll.add(i) ;
            }
        }
        System.out.println(coll);

        //使用iterator遍历 删除个位数为3的数
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){//iterator.next() 取出类型为Object类型
            if ((Integer)iterator.next()% 10== 3) {
                iterator.remove();
            }
        }
        System.out.println(coll);
        coll.remove(11);
        System.out.println(coll.size());

        Collection coll2 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            coll2.add((int)(Math.random() * 99));
        }

        System.out.println(coll2);
        coll.retainAll(coll2);
        System.out.println(coll);
    }
    @Test
    public void test(){
        String[] str = new String[5];
        for (String s : str) {
            s = "atguigu";
            if ("atguigu".equals(s)){
                s="atlk";

            }
            System.out.println(s);
        }
    }
}
