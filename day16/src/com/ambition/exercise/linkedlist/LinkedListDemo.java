package com.ambition.exercise.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/11:31
 * @Description:
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Cat> link = new LinkedList<>();
        link.add(new Cat("tom1", 19));
        link.add(new Cat("tom2", 17));
        link.add(new Cat("tom3", 16));
        link.addLast(new Cat("tom4", 16));
        link.addFirst(new Cat("tom5", 14));

        Iterator<Cat> iterator = link.iterator();
        System.out.println("新集合元素：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        Cat cat = link.removeFirst();
        System.out.println("被删除元素:" + cat.getName() + "\t" + cat.getAge());

        for (Cat cat1 : link) {
            System.out.println(cat1.toString());
        }
    }
}

class Cat {
    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
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
}
