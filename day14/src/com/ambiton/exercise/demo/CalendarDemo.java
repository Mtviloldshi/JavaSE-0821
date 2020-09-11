package com.ambiton.exercise.demo;

import java.util.Calendar;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/19:11
 * @Description:
 *  Calendar
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获得Calendar 日期对象
        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);//直接输出为 Calendar对象内容
        //获取年份
        int year = instance.get(Calendar.YEAR);
        //获取月份
        int month = instance.get(Calendar.MONTH);//月份从0 开始
        //获取当前月天数
        int day = instance.get(Calendar.DAY_OF_MONTH);
        //获取当天小时数
        int hours = instance.get(Calendar.HOUR_OF_DAY);
        //获取分钟数
        int minter = instance.get(Calendar.MINUTE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hours);
        System.out.println(minter);
    }
}
