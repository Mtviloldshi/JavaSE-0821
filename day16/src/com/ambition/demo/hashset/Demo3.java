package com.ambition.demo.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/11:51
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        //存储对象
        Set<Cat> cats = new HashSet<>();
        //添加元素
        cats.add(new Cat("tom",12));
        cats.add(new Cat("cc",12));
        cats.add(new Cat("bb",12));
        cats.add(new Cat("zz",12));
        cats.add(new Cat("zz",12));
        System.out.println(cats);
    }
}
class Cat{
    private String name;
    private Integer age;

    public Cat() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) &&
                age.equals(cat.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
