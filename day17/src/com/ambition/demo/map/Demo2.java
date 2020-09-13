package com.ambition.demo.map;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/9:32
 * @Description:
 * //一共三个班，编号分别为java、HTML，BD，每个班五个学生，每个学生有姓名、年龄
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<String, List<Student>> map = new HashMap<>();
        List<Student> list = new ArrayList<>();
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list.add(new Student("aaa",12));
        list.add(new Student("bbb",13));
        list.add(new Student("ccc",13));
        list1.add(new Student("ddd",14));
        list1.add(new Student("eee",15));
        list1.add(new Student("fff",16));
        list2.add(new Student("ggg",17));
        list2.add(new Student("hhh",18));
        list2.add(new Student("iii",19));
        map.put("Java",list);
        map.put("HTML",list1);
        map.put("BD",list2);

        //通过key拿value
        Set<String> strings = map.keySet();
        for (String key : strings) {
            System.out.println(key);
            List<Student> value = map.get(key);
            for (Student student : value) {
                System.out.println("姓名：" + student.getName() + "\t年龄：" + student.getAge());
            }
        }

        System.out.println("------------------");

        //通过拿键值对
        Set<Map.Entry<String, List<Student>>> entries = map.entrySet();
        for (Map.Entry<String, List<Student>> entry : entries) {
            String key = entry.getKey();
            System.out.println(key);
            List<Student> value = entry.getValue();
            for (Student student : value) {
                System.out.println("姓名：" + student.getName() + "\t年龄：" + student.getAge());
            }
        }

    }
}
class Student{
    private String name;
    private Integer age;

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
