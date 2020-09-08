package com.ambition.exercise.ing;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/18:55
 * @Description:
 *
 * 2、声明Wife类，包含姓名和丈夫属性，属性私有化，提供一个Wife(String name)的构造器，重写
 * toString方法，返回妻子的姓名和丈夫的姓名
 */
public class Wife {
    private String name;
    private Husband husband;

    @Override
    public String toString() {
        return "妻子姓名：" + name +
                "\t" + "丈夫姓名：" + husband.getName();
    }

    public Wife(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
