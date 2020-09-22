package com.ambition.demo.demo5stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/21/15:23
 * @Description:
 *
 * 终止操作
 *      执行后不能继续操作
 */
public class Demo3 {
    @Test
    public void test(){
        List<Integer> list = Arrays.asList(11, 92, 33, 24, 54);
        //1.allMatch(e -> e > 10)判断元素是否与条件匹配，是否都是大于10的
        boolean b = list.stream().allMatch(e -> e > 10);
        System.out.println(b);
        System.out.println("-----------");
        //
    }
}
