package com.ambition.demo.io.test05filewrite;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @Author: ambitions
 * @Date: 2020/09/14/16:33
 * @Description:
 *
 * 字符输入流：
 *      FileRead
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字符输入流
        FileReader fr = new FileReader("D:/test5.txt");
        //读取数据
//        while (fr.read() != -1){
//            System.out.println((char) fr.read());//一次读取一个字符，返回字符长度
//
//        }

        //读取字符数组
//        char[] cs = new char[4];
//        int len = fr.read(cs);//把数据读取到指定数组中，并返回字符个数

        //循环读取数据
//        int ch = -1;
//        while ((ch = fr.read()) != -1){
//            System.out.print((char) ch);
//        }

        //循环读取到字符数组
        char[] cs = new char[4];
        int len = 0;
        while ((len = fr.read(cs)) != -1){
            System.out.print(new String(cs,0,len));
        }

//        System.out.println(len);
//        System.out.println(cs);

        //关闭资源
        fr.close();
    }
}
