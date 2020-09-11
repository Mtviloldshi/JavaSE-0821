package com.ambiton.test01date;

import java.time.LocalDate;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/10:53
 * @Description:
 * LocalDate：jdk8 日期信息
 */
public class DemoLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());//月的第几天
        System.out.println(now.getDayOfWeek());//周当中的第几天
        System.out.println(now.getDayOfYear());//年当中的第几天

        //自定义日期对象
        LocalDate of = LocalDate.of(2020, 9, 10);
        System.out.println(of);
        //修改日期
        System.out.println(now.minusYears(1));
        System.out.println(now.plusYears(1));
    }
}
