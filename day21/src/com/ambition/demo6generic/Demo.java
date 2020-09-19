package com.ambition.demo6generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/16:25
 * @Description:
 *
 *      反射越过泛型
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getMethod("add", Object.class);
        add.invoke(list,123);

        System.out.println(list);
    }
}
