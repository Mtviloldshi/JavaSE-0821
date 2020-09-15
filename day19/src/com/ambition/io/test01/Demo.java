package com.ambition.io.test01;

import com.sun.beans.editors.ByteEditor;
import org.junit.Test;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/9:27
 * @Description:
 *
 *  缓冲流
 *      字节缓冲流： BufferedInputStream ， BufferedOutputStream
 *      字符缓冲流： BufferedReader ， BufferedWriter
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流,对字节流进行包装
        BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("test1.txt",true));//相对路径，默认在项目根目录

        //写数据
        bis.write(97);

        bis.write("hello BufferedOutputStream".getBytes());
        //关闭资源
        bis.close();
    }

    @Test
    public void test2() throws IOException {
        //创建高效的字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\sgg-study\\studyEveryday\\JAVASE\\JavaSE-0821\\test1.txt"));

        //循环读取字节数组
        byte[] bys = new byte[1024];
        int len = -1;
        while ((len = bis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }

        //循环读取
//        int ch = -1;
//        while ((ch = bis.read()) != -1){
//            System.out.print((char) ch);
//        }

        //读数据
//        int read = bis.read();
//        System.out.println((char) read);

        //关闭流
        bis.close();
    }

    @Test
    public void test3() throws IOException {
        //创建一个高效字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\sgg-study\\studyEveryday\\JAVASE\\JavaSE-0821\\test1.txt"));

        //创建高效字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test.txt"));

        //初始化输入数据存储容器
        byte[] bys = new byte[1024];
        //初始化返回长度值
        int len = -1;
        while ((len = bis.read(bys)) != -1){//判断是否有数据，并读取数据到容器，并返回文件长度
            bos.write(bys,0,len);//输出数据
        }

        //关闭流
        bos.close();
        bis.close();
    }
}
