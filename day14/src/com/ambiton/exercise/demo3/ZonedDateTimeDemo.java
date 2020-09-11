package com.ambiton.exercise.demo3;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/20:06
 * @Description:
 *  指定时区日期时间：ZonedDateTime
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now1 = LocalDateTime.now();//系统默认时区，当前是中国时间
        System.out.println(now1);
        LocalDateTime now2 = LocalDateTime.now(ZoneId.of("UTC"));//ZoneId.of("UTC"):中八区，格林威治时间,与中国时间相差8小时
        System.out.println(now2);
        LocalDateTime now3 = LocalDateTime.now(ZoneId.of("America/New_York"));//ZoneId.of("America/New_York"):纽约时间，,与中国时间相差12小时
        System.out.println(now2);
        LocalDateTime now4 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));//ZoneId.of("America/New_York"):纽约时间，,与中国时间相差12小时
        System.out.println(now4);
    }
}
