package com.ambition.demo3getmethods;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/14:44
 * @Description:
 */
public class Demo5Test {
    public static void main(String[] args) throws Exception {
        //获取class字节码对象
        Class<?> clazz = Class.forName("com.ambition.demo3getmethods.Student");
        //1.获取所有公共属性(public 修饰的) 不包括私有的
        Field[] fields = clazz.getFields();
        //2.获取所有属性，包括私有的
        Field[] declaredFields = clazz.getDeclaredFields();

        //3.获取属性公共的
        Field name = clazz.getField("name");
        //获取对象
        Student stu = (Student) clazz.newInstance();
        //参数1当前对象，属性值
        name.set(stu,"tom");
        System.out.println(stu.name);

        //4.获取私有的属性
        Field age = clazz.getDeclaredField("age");
        //开放权限
        age.setAccessible(true);
        age.set(stu,22);
        System.out.println(stu);
    }
    @Test//通过反射获取、调用方法
    public void testGetMethod() throws Exception {
        //获取class字节码对象
        Class<?> clazz = Class.forName("com.ambition.demo3getmethods.Student");
        //1.获取所有公共方法，不包括私有的，包括父类的
        Method[] methods = clazz.getMethods();
        //2.获取所有方法，包括私有的，不包括父类的
        Method[] declaredMethods = clazz.getDeclaredMethods();
        //3.获取公共方法无参、有参
        Method show = clazz.getMethod("show");//参数为方法名
        //获取对象
        Student stu = (Student)clazz.newInstance();
        show.invoke(stu);

        //获取私有
        Method testPrivate = clazz.getDeclaredMethod("testPrivate");
        testPrivate.setAccessible(true);
        testPrivate.invoke(stu);
    }
}
