package com.ambition.exercise.text2;

import org.junit.Test;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/21:04
 * @Description:
 *
 * String 与 StringBuffer StringBuilder 效率测试
 */
public class StringAndStringBufferAndStringBuilder {
    @Test
    public void test1(){
        //String
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//471 毫秒
    }

    @Test
    public void test2(){
        //StringBuilder
        long start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < 10000; i++) {
            str.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//3毫秒
    }
}
