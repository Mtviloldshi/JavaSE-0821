package com.ambition.demo.io.test03fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/15:31
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("D:/test.txt"));
        //读取数据
        //读一个字节到内存当中
//        int read = fis.read();
//        //控制台打印读取到的数据
//        System.out.println(read);
        int by = -1;
        while ((by=fis.read()) != -1){
            System.out.println((char) by);
        }
        //关闭资源
        fis.close();
    }
}
