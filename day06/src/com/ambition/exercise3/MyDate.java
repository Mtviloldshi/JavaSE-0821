package com.ambition.exercise3;
/*
 * 语法与技能：
 * 包、类（属性、构造器、方法）、对象、this
 * eclipse使用
 * 在com.atguigu.test03.bean包中定义一个日期MyDate类。
 * 属性：
 * year：年
 * month：月
 * day：日
 * 构造方法：
 * 满参构造方法
 * 成员方法：
 * get/set方法
 * void showDate方法：打印日期。
 * boolean isLeapYear()方法：判断当前日期是否是闰年
 * 在com.atguigu.test03.test包中定义测试类：创建MyDate对象，并测试。
 */
public class MyDate {
    int year;
    int month;
    int day;

    //打印日期
    public void showDate() {
        System.out.println("日期：" + year + "年" + month + "月" + day + "日" + isLeapYear(year));
    }

    //判断闰年
    public String isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return "是闰年";
        } else {
            return "不是闰年";
        }
    }

    public MyDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
