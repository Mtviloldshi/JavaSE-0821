package com.ambiton.exercise.demo5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/20:40
 * @Description:
 *  该类提供了三种格式化方法：
 * 预定义的标准格式。如：ISO_DATE_TIME;ISO_DATE
 * 本地化相关的格式。如：ofLocalizedDate(FormatStyle.MEDIUM)
 * 自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        //实例化当前事件对象
        LocalDateTime now = LocalDateTime.now();
        //实例化格式化日期对象 预定义的标准格式 获取日期时间 毫秒
        DateTimeFormatter dateTime = DateTimeFormatter.ISO_DATE_TIME;
        //格式化日期为字符串
        String format = dateTime.format(now);
        System.out.println(format);
        System.out.println("------------------");
        //获取日期
        DateTimeFormatter ds= DateTimeFormatter.ISO_DATE;
        System.out.println(ds.format(now));
        System.out.println("------------------");
        //本地相关的格式 2020年9月9日 星期三
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(now));
        System.out.println("-----------");
        //自定义时间格式
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yy年MM月dd日 HH时mm分ss秒 E");
        //格式化时间对象为字符串
        String format1 = pattern.format(now);
        System.out.println(format1);

        //字符串解析为事件对象 返回时间对象的超类
        TemporalAccessor parse = pattern.parse(format1);
        System.out.println(parse);
    }
}
