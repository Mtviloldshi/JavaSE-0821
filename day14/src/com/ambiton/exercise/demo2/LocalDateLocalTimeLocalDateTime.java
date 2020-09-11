package com.ambiton.exercise.demo2;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/19:40
 * @Description:
 *  LocalDateLocalTimeLocalDateTime
 */
public class LocalDateLocalTimeLocalDateTime {

    @Test
    public void testlocalDate(){
        //LocalDate 包含年 月 日
        LocalDate now = LocalDate.now();
        LocalDate now1 = LocalDate.now();
        System.out.println(now.getYear());//获取年份
        System.out.println(now.getMonthValue());//获取月份
        System.out.println(now.getDayOfYear());//获取当年天数
        System.out.println(now.getDayOfMonth());//获取当月天数
        System.out.println(now.getDayOfWeek().getValue());//获取本周天数,从星期一开始算

        System.out.println("----------------");

        //年份 - 1
        LocalDate localDate = now.minusYears(1);
        System.out.println(localDate);
        //年份 + 2
        LocalDate localDate2 = now.plusYears(2);
        System.out.println(localDate2);

        //月份 -n + n
        //天数 -n + n
    }

    @Test
    public void testLocalTime(){
        // 初始化LocalTime 对象获取当前时间 ， LocalTime：包括 时-分-秒-纳秒
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.getHour());//获取当前小时
        System.out.println(localTime.getMinute());//获取当前分钟
        System.out.println(localTime.getSecond());//获取当前秒
        System.out.println(localTime.getNano());//获取当前纳秒
        LocalTime localTime2 = LocalTime.now();
        //比较两个时间是否相等
        System.out.println(localTime.isAfter(localTime2));

        //当前小时数 - 5
        LocalTime localTime1 = localTime.minusHours(5);
        System.out.println(localTime1);
        //当前小时数 + 6
        LocalTime localTime3 = localTime.plusHours(6);
        System.out.println(localTime3);

        //当前分钟数 -n +n
        //当前秒数 -n +n
    }

    @Test
    public void testTimeLocalDateTime(){
        // 初始化LocalDateTime对象,获取当前时间 ，LocalDateTime：包括 年 月 日 时-分-秒-纳秒 星期数
        LocalDateTime now = LocalDateTime.now();
        //直接输出为： 2020-09-09T20:02:12.377
        System.out.println(now);
        //获取 当前年-月-日 时分秒..
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        //获取当前年份天数 月份天数 纳秒...

        //当前年份 -+n 。。。

        //比较相等
    }
}
