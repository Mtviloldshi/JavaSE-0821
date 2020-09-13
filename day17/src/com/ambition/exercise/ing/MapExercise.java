package com.ambition.exercise.ing;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/11:20
 * @Description:
 *
 * （1）存储咱们班每组学员信息，组长姓名为key，组员包括组长自己为value
 * （2）遍历显示
 * （3）从键盘输入一个学员姓名，查找这个学员是否咱们班
 */
public class MapExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Student>> map = new HashMap<>();
        List<Student> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        list.add(new Student("aaa",23));
        list.add(new Student("bbb",13));
        list2.add(new Student("ccc",12));
        list2.add(new Student("ddd",3));
        list3.add(new Student("eee",1));
        list3.add(new Student("fff",2));
        map.put("aaa",list);
        map.put("ccc",list2);
        map.put("eee",list3);

        System.out.println("请输入姓名：");
        String name = scan.next();
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            if (name.equals(key)){
//                System.out.println("是本班学生！");
//                return;
//            }else {
//                List<Student> list1 = map.get(key);
//                for (Student student : list1) {
//                        if (name.equals(student.getName())){
//                            System.out.println("是本班学生！");
//                            return;
//                        }
//                }
//            }
//        }
//        System.out.println("不是本班学生！");

        Set<Map.Entry<String, List<Student>>> entries = map.entrySet();
        Iterator<Map.Entry<String, List<Student>>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<Student>> next = iterator.next();
            if (name.equals(next.getKey())){
                System.out.println("是本班学生！");
                return;
            }else {
                List<Student> value = next.getValue();
                Iterator<Student> iterator1 = value.iterator();
                while (iterator1.hasNext()){
                    Student next1 = iterator1.next();
                    if (name.equals(next1.getName())){
                        System.out.println("是本班学生！");
                        return;
                    }
                }
            }
        }
        System.out.println("不是本班学生！");
    }
}
class Student{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

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
}
