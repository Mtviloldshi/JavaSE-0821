package com.ambition.comparable;

/**
 * @author 86176
 *
 * Comparable 来进行对类对象的排序
 *  测试类省略
 */
public class Student implements Comparable{
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        int i = this.getAge() - student.getAge();
        return i;
    }
}
