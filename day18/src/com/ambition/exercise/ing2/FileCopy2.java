package com.ambition.exercise.ing2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/18:03
 * @Description:
 *
 * 使用字符流复制文本文件 一次读写一个字符
 *  * 使用字符流复制文本文件 一次读写一个字符数组
 */
public class FileCopy2 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流
        FileWriter fw = new FileWriter("D:/test6.txt");
        //创建字节输入流
        FileReader fr = new FileReader("D:/test4.txt");

        //使用字符流复制文本文件 一次读写一个字符数组
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1){
            fw.write(cs,0,len);
        }

        //使用字符流复制文本文件 一次读写一个字符
//        int ch = -1;
//        while ((ch = fr.read()) != -1){
//            fw.write(ch);
//        }

        //写入数据
//        for (int i = 65; i < 70; i++) {
//            fw.write(i);
//        }
        //释放资源
        fw.close();
    }
}
