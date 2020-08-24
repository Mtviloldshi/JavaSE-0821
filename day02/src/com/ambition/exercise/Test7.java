package com.ambition.exercise;

//第七题
public class Test7 {

    public static void main(String[] args) {
        int week = 2;
        int days = 100;
        int week2 = 100 % 7 + week;//余数加上当前日期
        System.out.println("今天是周" + week + ",100天以后是周" + week2);
    }

}
