package com.ambition.demo.test02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/11:11
 * @Description:
 *  for each 增强for循环
 *      底层使用iterator原理
 *      可遍历数组
 */
public class Demo2For {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(11);
        coll.add(11);
        coll.add(11);

        //for each 遍历增强for循环 /
        for (Object obj ://集合元素类型
                coll) {//集合对象
            System.out.println(obj);
        }
        for (Object o : coll) {
            System.out.println(o);
        }

        int[] arr = {1,2,3};
        for (int i : arr) {//底层时普通for
            System.out.println(i);
        }
    }
}
