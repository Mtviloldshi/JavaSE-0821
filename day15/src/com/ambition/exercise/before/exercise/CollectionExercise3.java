package com.ambition.exercise.before.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/18:08
 * @Description:
 *
 * 声明学员类型Student，包含属性：姓名，成绩
 * 添加本组学员Student对象到Collection的某个集合中
 * 使用foreach遍历
 * 使用Iterator遍历，并删除成绩低于60分的
 */
public class CollectionExercise3 {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
//        添加本组学员Student对象到Collection的某个集合中
        students.add(new Student("成员1",88));
        students.add(new Student("成员2",98));
        students.add(new Student("成员3",55));
        students.add(new Student("成员4",43));

        //使用foreach遍历
        for (Student studen:
             students) {
            System.out.println("姓名:" + studen.getName() + "\t成绩:" + studen.getScore());
        }

        //使用Iterator遍历，并删除成绩低于60分的
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if (next.getScore() < 60){
                iterator.remove();
            }
        }
        System.out.println("成绩高于60：");
        //使用foreach遍历
        for (Student studen:
                students) {
            System.out.println("姓名:" + studen.getName() + "\t成绩:" + studen.getScore());
        }
    }
}
