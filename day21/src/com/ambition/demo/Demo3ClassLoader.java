package com.ambition.demo;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/10:34
 * @Description:
 */
public class Demo3ClassLoader {
    public static void main(String[] args) {
        //获取指定类的类加载器对象
        ClassLoader classLoader = Demo3ClassLoader.class.getClassLoader();
        System.out.println(classLoader);

        //获取当前类上下文加载器
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);

        //获取当前类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        System.out.println("-----------------------------------------");
        //获取一个类的父加载器对象
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
