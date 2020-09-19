package com.ambition.demo3getmethods;

import java.lang.reflect.Method;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/14:24
 * @Description:
 *
 * //获取方法
 */
public class Demo4Method {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.ambition.demo3getmethods.Student");

        //1.获取所有公共方法(public修饰的，包括父类的)
        Method[] methods = clazz.getMethods();
//        System.out.println(methods.length);
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }
        //2.获取当前类的所有方法，包括私有的，但不包括父类的
        Method[] declaredMethods = clazz.getDeclaredMethods();
//        System.out.println(declaredMethods.length);

        //3.获取单个方法(公共的)
        Method method = clazz.getMethod("show");//参数的方法名
        //调用方法
        Student stu = (Student) clazz.newInstance();
        method.invoke(stu);

        //4.获取私有方法
        Method testPrivate = clazz.getDeclaredMethod("testPrivate");
        //开启访问权限
        testPrivate.setAccessible(true);
        testPrivate.invoke(stu);

        //5.获取带参方法并调用
        Method testParam = clazz.getMethod("testParam", String.class, int.class);
        //执行方法
        testParam.invoke(stu,"tom",20);

        //6.获取带返回值方法
        Method testReturn = clazz.getMethod("testReturn", int.class);
        Object invoke = testReturn.invoke(stu, 11);
        System.out.println(invoke);
    }
}
