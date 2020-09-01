package com.ambition.exercise.after3;

/*
    1、声明一个父类Employee员工类型，有属性，姓名（String） 有方法，public double earning()
    用于返回实发工资，默认返回0 public String getInfo()：显示姓名和实发工资
 */
public class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public double earning() {
        return 0;
    }
    public String getInfo(){
        return "姓名:" + name + "\t实发工资：" + earning();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
