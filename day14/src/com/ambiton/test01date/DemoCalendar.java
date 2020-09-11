package com.ambiton.test01date;

import java.util.Calendar;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/9:58
 * @Description:
 *
 *  Calendar日历类：
 *      提供了许多的常量字段方便操作日期
 */
public class DemoCalendar {
    public static void main(String[] args) {
        //获取Calendar 实例对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DATE));//获取当月日期
        System.out.println(calendar.get(Calendar.YEAR));//获取当前年份
        System.out.println(calendar.get(Calendar.MONTH));//获取当前月份
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//获取当前日期的星期数
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//获取今天是当前年份的天数
        System.out.println(calendar.get(Calendar.HOUR));//获取当前小时
        System.out.println(calendar.get(Calendar.MINUTE));//获取当前分钟
        System.out.println(calendar.get(Calendar.SECOND));//获取当前秒数

    }
}
