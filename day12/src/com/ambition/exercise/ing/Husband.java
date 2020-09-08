package com.ambition.exercise.ing;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/18:53
 * @Description:
 *
 * 1、声明Husband类，包含姓名和妻子属性，属性私有化，提供一个Husband(String name)的构
 * 造器，重写toString方法，返回丈夫姓名和妻子的姓名
 */
public class Husband {
    private String name;
    private Wife wife;

    public Husband(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "丈夫姓名：" + name +
                "\t" + "妻子姓名：" + wife.getName();
    }
}
