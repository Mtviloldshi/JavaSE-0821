package com.ambition.demo.io.test4copy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/15:53
 * @Description:
 *
 *      复制一个文本文件
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建一个文件输出流
       FileOutputStream fos  = new FileOutputStream("D:/test.txt");
       //创建一个文件输入流
        FileInputStream fis = new FileInputStream("D:/test2.txt");

        //读写操作
        int ch = -1;
        while ((ch = fis.read()) != -1){//判断是否还有数据
            fos.write(fis.read());//读取到的数据写到文件中
        }

        //关闭流
        fos.close();
        fis.close();

    }
}
