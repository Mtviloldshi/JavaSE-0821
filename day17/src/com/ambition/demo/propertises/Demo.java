package com.ambition.demo.propertises;

import java.util.Properties;
import java.util.Set;
import java.util.function.Predicate;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/11:13
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Properties pror = new Properties();
        pror.setProperty("user","tom");
        pror.setProperty("id","101");
        pror.setProperty("pwd","123");
        Set<Object> objects = pror.keySet();
        for (Object object : objects) {
            Object o = pror.get(object);
            System.out.println(object + " " + o);
        }
    }
}
