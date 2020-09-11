package com.ambiton.exercise.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/19:24
 * @Description:
 *
 * SimpleDateFormat用于日期时间的格式化。
 *
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //获取当前时间
        Date date = new Date();
        //实例化SimpleDateFormat                   //自定义输出格式
        SimpleDateFormat sm = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒 E");
        //返回格式化日期为字符串
        String format = sm.format(date);
        System.out.println(format);

        //返回解析字符串的日期
        Date parse = sm.parse(format);
        System.out.println(parse);
    }
}
