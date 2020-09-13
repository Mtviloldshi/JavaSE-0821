package com.ambition.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/10:11
 * @Description:
 */
public class Demo4 {
    public static void main(String[] args) {
        //map中的key为Person value为Person名字
        Map<Person,String> map = new HashMap<>();
        Person p1 = new Person("aaa", 12);
        Person p2 = new Person("bbb", 15);
        Person p3 = new Person("ccc", 19);
        Person p4 = new Person("ddd", 120);
        map.put(p1,p1.getName());
        map.put(p2,p2.getName());
        map.put(p3,p3.getName());
        map.put(p4,p4.getName());

        Set<Person> people = map.keySet();
        for (Person person : people) {
            System.out.println(person);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        return age.equals(person.age);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
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
