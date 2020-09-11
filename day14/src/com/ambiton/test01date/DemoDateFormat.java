package com.ambiton.test01date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/10:08
 * @Description:
 *
 *  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 *      format(new Date()):格式化日期为字符串
 *      parse(format2) : 解析字符串为日期
 *
 * 2020/10/1
 */
public class DemoDateFormat {
    public static void main(String[] args) throws ParseException, InterruptedException {
        String str = "2020-10-1";
        Date date = new Date();
        //日期对象转换为字符串：这个过程称为日期的格式化
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String format1 = format.format(date);
        System.out.println(format1);

        //字符串转日期对象 解析日期
        SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = si.parse(str);
        System.out.println(parse);

        Thread.sleep(1000);
        System.out.println("---------------------");
        //格式化日期                                               //定义格式化格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //传入日期对象 返回日期字符
        String format2 = simpleDateFormat.format(new Date());
        System.out.println(format2);

        System.out.println(simpleDateFormat.parse(format2));
    }
}
