package com.ambition.exercise.arraylist1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/9:25
 * @Description:
 */
public class ArrayListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random();
        for (; ; ) {
            int num = random.nextInt(100);
            list.add(num);
            if (list.size() == 5) {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }

    @Test
    public void test(){
        List list = new ArrayList();

        for (int i = 0; i < 5; i++) {
            list.add("string" + 1);
        }

        for (Object o : list) {
            System.out.print(o + "\t");
        }
    }

    @Test
    public void test1(){
        List list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add(new Person("person" + i,18 + i));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
class Person{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
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

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}