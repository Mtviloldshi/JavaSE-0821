package com.ambition.demo5annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/16:03
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
//        Class<Student> clazz = Student.class;
        Class<?> clazz = Class.forName("com.ambition.demo5annotation.Student");
        //获取类上的注解
//        Annotation anno = clazz.getAnnotation(MyAnno.class);
//        System.out.println(anno);

        //获取指定的方法
        Method m1 = clazz.getMethod("setName", String.class);
        //获取对象
        Student stu = (Student)clazz.newInstance();
        //获取方法上的指定注解
        MyAnno anno = m1.getAnnotation(MyAnno.class);
        //获取注解值
        String value = anno.value();
        //执行调用方法,将方法的参数设置为注解的值
        m1.invoke(stu,value);

//        System.out.println(stu);
        System.out.println(stu);

    }
}
