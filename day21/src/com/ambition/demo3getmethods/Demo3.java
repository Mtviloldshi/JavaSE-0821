package com.ambition.demo3getmethods;

import java.lang.reflect.Field;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/14:08
 * @Description:
 *
 * 反射获取属性
 *
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        String str = "com.ambition.demo3.Student";
        Class<?> clazz = Class.forName(str);
        //1.获取所有公共属性（public修饰的）
        Field[] fields = clazz.getFields();
        //2.获取所有属性 包括私有的
        Field[] declaredFields = clazz.getDeclaredFields();
        //3.获取单个属性
        Field name = clazz.getField("name");
        //获取对象
        Student stu = (Student) clazz.newInstance();
        //给属性赋值(参数1是对象，参数二是属性值)
        name.set(stu,"tom");
        //
        System.out.println(stu.name);

        //4.获取单个属性私有的
        Field age = clazz.getDeclaredField("age");
        //设置访问权限
        age.setAccessible(true);
        //赋值
        age.set(stu,12);
        System.out.println(stu);

    }
}
