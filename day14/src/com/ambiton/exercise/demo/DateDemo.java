package com.ambiton.exercise.demo;

import java.util.Date;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/19:06
 * @Description:
 *
 ** Date
 *     * new Date()：当前系统时间
 *     * long getTime()：返回该日期时间对象距离1970-1-1 0.0.0 0毫秒之间的毫秒值
 *     * new Date(long 毫秒)：把该毫秒值换算成日期时间对象
 */
public class DateDemo {
    public static void main(String[] args) {
        //创建当前日期对象
        Date date = new Date();
        System.out.println(date);//直接输出结果为：Wed Sep 09 19:06:49 CST 2020
        //获取当前距离1970-1-1 00:00:00年的总毫秒数
        long time = date.getTime();
        System.out.println(time);
        //将毫秒数转换为当前日期
        Date date1 = new Date(time);
        System.out.println(date);
    }
}
