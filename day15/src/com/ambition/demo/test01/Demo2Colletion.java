package com.ambition.demo.test01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: ambitions
 * @Date: 2020/09/11/10:29
 * @Description:
 * 自定义对象 存储
 */
public class Demo2Colletion {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Student("tom",19));
        coll.add(new Student("jack",20));
        coll.add(new Student("fuck",17));

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println((Student)objects[i]);
//            System.out.println(objects[i]);
        }
    }
}
class Student{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


}
