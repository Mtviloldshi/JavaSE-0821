package com.ambition.exercise.after3;

/*
    2、声明子类：Student类，继承Person类 新增属性：score成绩 属性私有化，get/set 包含getInfo()方
    法：例如：姓名：张三，年龄：23，性别：男，成绩：89
 */
public class Student extends Person {
    private int score;

    public Student(String name, int age, char gender, int score) {
        super(name, age, gender);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getInfo() {
        return super.getInfo() + ",成绩：" + score;
    }
}
