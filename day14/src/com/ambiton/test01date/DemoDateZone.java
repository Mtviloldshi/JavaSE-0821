package com.ambiton.test01date;

import org.junit.Test;
import sun.util.resources.de.LocaleNames_de;

import java.time.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/11:11
 * @Description:
 *
 * DateZone 时区
 */
public class DemoDateZone {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());//系统默认默认时区时间
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Shanghai")));//自定义指定时区时间
        System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));//美国时区时间
        System.out.println(LocalDateTime.now(ZoneId.of("UTC")));//格林威治时区时间

    }

    @Test
    public void test(){
        LocalDate now = LocalDate.now();
        LocalDate before = LocalDate.of(1998, 11, 22);
        Period between = Period.between(before, now);//比较两个日期间隔

        System.out.println(between.toTotalMonths());//总相差月数

    }

    @Test
    public void test2(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime before = LocalDateTime.of(1998, 11, 22,10,10,10);
        Duration between = Duration.between(before, now);//比较两个日期间隔

        System.out.println(between.toDays());//总天数
        System.out.println(between.toMillis());//总秒数


    }


}
