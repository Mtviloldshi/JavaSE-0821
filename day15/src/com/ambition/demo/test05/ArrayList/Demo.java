package com.ambition.demo.test05.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/15:20
 * @Description:
 *
 * ArrayList底层实现：
 *  构造方法：
 *      jdk6中：空参构造直接创建10个长度数组
 *      jdk7（新版）jdk8中：默认初始内容0，在添加第一元素时初始化默认长度为0
 *      容量不足时，扩容为原容量的1.5倍 向下取整 例：
 *                                          15* 1.5 =22.5 --> 22
 */
public class Demo {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);//不能进行添加操作


        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 22; i++) {
            arrayList.add(i);
        }
        arrayList.add(11);
    }
}
