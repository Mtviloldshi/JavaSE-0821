package com.ambiton.exercise.demo4;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/20:31
 * @Description:
 *  Period和Duration
 */
public class PeriodDurationDemo {
    @Test
    public void testPeriod() throws InterruptedException {
        //初始化两个日期对象
        LocalDate now = LocalDate.now();
        Thread.sleep(1000);
        LocalDate now2 = LocalDate.now();

        //比较两个日期
        Period between = Period.between(now, now2);
        //返回两个日期相差的月数
        long l = between.toTotalMonths();
        System.out.println(l);

    }

    @Test
    public void testDuration() throws InterruptedException {
        //初始化两个时间对象
        LocalTime now1 = LocalTime.now();
        Thread.sleep(10000);
        LocalTime now2 = LocalTime.now();

        //比较两个时间
        Duration between = Duration.between(now1, now2);
        //返回两个时间相差的纳秒数
        long l = between.getNano();
        System.out.println(l);

    }
}
