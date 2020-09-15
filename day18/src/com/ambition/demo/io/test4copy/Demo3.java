package com.ambition.demo.io.test4copy;

import com.sun.org.apache.regexp.internal.RE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/16:20
 * @Description:
 * 文件复制
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:/test3.txt");
        FileInputStream fis = new FileInputStream("D:/test.txt");

        byte[] bys = new byte[1024];//读取数据到字节数组
        int len = 0;//初始化返回数据长度
        while ((len = fis.read(bys)) != -1){//判断是否有数据
            fos.write(bys,0,len);//写入字节数组指定长度数据到文件
        }
        fos.close();
        fis.close();
    }
}
