package com.ambiton.test01date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/11:29
 * @Description:
 *
 * DateTimeFormat : LocalDate LocalDateTime格式化
 * 该类提供了三种格式化方法：
 * 预定义的标准格式。如：ISO_DATE_TIME;ISO_DATE
 * 本地化相关的格式。如：ofLocalizedDate(FormatStyle.MEDIUM)
 * 自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
 */
public class DemoDateTimeFormat {
    public static void main(String[] args) {
        //创建当前日期
        LocalDateTime now = LocalDateTime.now();
        //自定义格式化日期格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //按自定义格式化方式格式化日期
        String format = dateTimeFormatter.format(now);
        //输出日期
        System.out.println(format);
        //一步输出
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));

        //解析字符串为时间日期
        System.out.println(dateTimeFormatter.parse(format));
    }
}
