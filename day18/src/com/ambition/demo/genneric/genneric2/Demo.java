package com.ambition.demo.genneric.genneric2;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/10:00
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //jdk7之后自动推导
        Student<Integer> student = new Student<Integer>("ss",99);
        Student<Double> student2 = new Student<Double>("ss",99.9);
    }
}
class Student<E>{
    private String name;
    private E score;
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getScore() {
        return score;
    }

    public void setScore(E score) {
        this.score = score;
    }

    public Student(String name, E score) {
        this.name = name;
        this.score = score;
    }
}
