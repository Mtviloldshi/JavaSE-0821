package com.ambition.demo.io.test05filewrite;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/16:24
 * @Description:
 *
 *  字符流：
 *      FileWrite:字符输出流
 *      FileRead：字符输入流
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建一个字符输出流
        FileWriter fw = new FileWriter("D:/test5.txt", true);
        //写入数据
        //写一个字符
//        fw.write('刘');

        //写一个字符数组
        char[] cs = {'刘','b','c'};
//        fw.write(cs);

        //写字符数组的一部分
        fw.write(cs,0,2);

        //写一个字符串
        fw.write("  hello");

        //关闭流
        fw.close();
    }
}

