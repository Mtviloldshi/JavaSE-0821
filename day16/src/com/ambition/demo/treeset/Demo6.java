package com.ambition.demo.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/15:56
 * @Description:
 */
public class Demo6 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int i = o1.getAge() - o2.getAge();
                i = i == 0? o1.getName().compareTo(o2.getName()) : i;
                return i;
            }
        });
        set.add(new Person("tom",123));
        set.add(new Person("tom1",13));
        set.add(new Person("tom",12));
        set.add(new Person("tom1",123));
        set.add(new Person("tom",123));

        for (Person person : set) {
            System.out.println(person.toString());
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

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
