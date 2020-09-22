package com.ambition.demo.review.ing1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/19:02
 * @Description:
 *
 *  通过反射动态创建获取对象，并操作对象属性，方法。
 */
public class UserDemo {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class clazz = Class.forName("com.ambition.demo.review.ing1.User");
        //获取全部公共属性
        //获取全部属性
        //获取全部公共方法，不包括私有方法，包括父类方法
        //获取全部方法，包括私有方法，不包括父类方法
        //动态获取对象
        User user = (User) clazz.newInstance();//通过字节码对象获取对象，前提要有空参构造器
        //获取单个公共属性
        Field gender = clazz.getDeclaredField("gender");
        gender.set(user,"f");
        //获取单个同包属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        //动态的为属性赋值
        name.set(user,"tom");
        System.out.println(user);

        //获取私有方法
        Method privateTest = clazz.getDeclaredMethod("privateTest", int.class);
        privateTest.setAccessible(true);
        privateTest.invoke(user,100);

        //获取公共方法
        Method testParam = clazz.getMethod("testParam", int.class, int.class);
        Object invoke = testParam.invoke(user, 13, 25);
        System.out.println(invoke);

        //获取公共属性
        Field age = clazz.getField("age");//只用于获取属性方法
        age.set(user,20);
        System.out.println(user);

        //获取构造器
        Constructor constructor = clazz.getConstructor(String.class, int.class, String.class);
        User user2 = (User)constructor.newInstance("tom", 12, "m");
        System.out.println(user2);
    }
}
