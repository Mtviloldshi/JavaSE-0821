package com.ambition.demo.io.test02in_ouput;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/14:52
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输出流,如果文件不存在，自动创建文件
//        FileOutputStream fos = new FileOutputStream("D:/test2.txt");//底层自动创建
        //第二个参数表示是否追加写入，默认false
        FileOutputStream fos = new FileOutputStream("D:/test1.txt",true);//底层自动创建
        //写一个字节
        fos.write(97);
        //写入换行符，在windows中写入换行符
        fos.write("\r\n".getBytes());
        fos.write(98);
        //关闭流
        fos.close();
    }

    @Test
    public void test() throws IOException {
        //创建一个文件字节输出流
        FileOutputStream fos = new FileOutputStream(new File("D:/test.txt"),true);//追加写入
        //写入字节
        fos.write(98);
        //换行
        fos.write("\r\n".getBytes());
        fos.write(100);
        //关闭资源
        fos.close();
    }
}
