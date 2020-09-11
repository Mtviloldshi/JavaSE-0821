package com.ambition.exercise.before.exercise;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/18:09
 * @Description:
 * 声明学员类型Student，包含属性：姓名，成绩
 */
public class Student {
    private String name;
    private Integer score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }
}
