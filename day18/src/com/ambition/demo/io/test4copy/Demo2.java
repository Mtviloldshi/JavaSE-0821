package com.ambition.demo.io.test4copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/16:09
 * @Description:
 *      文件的复制
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建文件输出流
        FileOutputStream fos = new FileOutputStream("D:/test1.txt",true);
        //创建文件输入流
        FileInputStream fis = new FileInputStream("D:/test.txt");

        //读取数据
        int ch = -1;
        while ((ch= fis.read()) != -1){//判断是否有数据
            fos.write(fis.read());//如果有 读取出来写入到文件
        }

        //关闭资源
        fos.close();
        fis.close();
    }
}
