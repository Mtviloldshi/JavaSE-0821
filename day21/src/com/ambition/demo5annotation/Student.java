package com.ambition.demo5annotation;

/**
 * @Author: ambitions
 * @Date: 2020/09/19/16:05
 * @Description:
 */
public class Student {
    private String name;

    @MyAnno("setNameMethod")//例如：这个注解的value值要传给方法参数
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
