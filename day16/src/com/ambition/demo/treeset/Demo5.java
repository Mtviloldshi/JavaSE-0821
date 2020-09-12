package com.ambition.demo.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/15:43
 * @Description:
 */
public class Demo5 {
    public static void main(String[] args) {
        Set<User> set = new TreeSet<>(new MyComparator());
        set.add(new User("tom",123));
        set.add(new User("tom1",123));
        set.add(new User("tom1",13));
        set.add(new User("tom",123));
        for (User user : set) {
            System.out.println(user.toString());
        }
    }
}
//自定义比较器，比较两个对象的大小
class MyComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int i = o1.getAge() - o2.getAge();
        i = i == 0? o1.getName().compareTo(o2.getName()) : i;
        return i;
    }
}
class User{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}