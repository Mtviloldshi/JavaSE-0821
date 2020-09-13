package com.ambition.exercise.before;

import java.util.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/12/21:05
 * @Description:
 * （1）存储咱们班每组学员信息，组长姓名为key，组员包括组长自己为value
 * （2）遍历显示
 * （3）从键盘输入一个学员姓名，查找这个学员是否咱们班
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        Map<String, List<Student>> map = new HashMap<>();
        List<Student> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list.add(new Student("yyy",111));
        list.add(new Student("ccc",122));
        list2.add(new Student("eee",133));
        list2.add(new Student("aaa",144));
        map.put("yyy",list);
        map.put("eee",list2);
        System.out.println("请输入学生名字：");
        String name = can.next();
        Collection<List<Student>> values = map.values();
        //获得Collection迭代器
        Iterator<List<Student>> iterator = values.iterator();
        while (iterator.hasNext()){
            //活得每一个list迭代器
            List<Student> next = iterator.next();
            //获得Student对象
            Iterator<Student> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                //判断对象
                if (name.equals(iterator1.next().getName())){
                    System.out.println("是本班学生");
                    return;
                }
            }
        }
        System.out.println("不是！");
    }
}
class Student{
    private String name;
    private Integer number;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }
}
