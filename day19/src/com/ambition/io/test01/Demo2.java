package com.ambition.io.test01;

import org.junit.Test;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/10:09
 * @Description:
 *
 * 字符缓冲流： BufferedReader ， BufferedWriter
 */
public class Demo2 {
    @Test
    public void test() throws IOException {
        //高效字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //输出数据
        bw.write('a');
        //写入一个换行
        bw.newLine();//字符流特有

        bw.write("jsjsss");
        bw.write("jsjsjs".toCharArray());

        bw.flush();//刷新缓冲区

        bw.write("哈哈哈");

        //关闭流，同时刷新缓存区
        bw.close();
    }

    @Test
    public void test2() throws IOException {
        //高效字符输入流
        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
        //读一个字符数组
//        char[] csh = new char[1024];
//        int ch = -1;
//        while ((ch = br.read(csh)) != -1){
//            System.out.println(new String(csh,0,ch));
//            bw.write(csh,0,ch);
//        }

        String s = null;
        //一次读取一行。
        while ((s =br.readLine() )!= null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        //读一个字符
//        System.out.println((char) br.read());

        br.close();
        bw.close();
    }

}
