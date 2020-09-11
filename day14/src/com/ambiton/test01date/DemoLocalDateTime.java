package com.ambiton.test01date;

import java.time.LocalDateTime;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/11:04
 * @Description:
 *
 *      LocalDateTime
 */
public class DemoLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());//获取纳秒

        //自定义时间
        System.out.println(LocalDateTime.of(2020, 10, 10, 10, 10, 10));
        //修改时间
    }
}
