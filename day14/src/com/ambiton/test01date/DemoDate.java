package com.ambiton.test01date;

import java.util.Date;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/9:46
 * @Description:
 *
 *  Date 类：大部分的构造方法和实例方法都过期了，推荐使用Calendar
 *      new Date().getTime()获取1970年开始当前时间的毫秒值
 */
@SuppressWarnings(value = "all")
public class DemoDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//获取当前日期时间
        System.out.println(date.getTime());//获取1970年开始当前时间的毫秒值
    }
}
