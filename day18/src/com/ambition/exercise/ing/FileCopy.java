package com.ambition.exercise.ing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/17:43
 * @Description: 作业：
 * 使用字节流复制文件 一次读写一个字节
 * 使用字节流复制文件 一次读写一个字节数组
 * <p>
 * 使用字符流复制文本文件 一次读写一个字符
 * 使用字符流复制文本文件 一次读写一个字符数组
 */
public class FileCopy {
    //    使用字节流复制文件 一次读写一个字节
    public static void main(String[] args) throws IOException {
            //创建字节输出流(把数据从Java内存写入到硬盘文件)
        FileOutputStream fos = new FileOutputStream("D:test3.txt",true);//追加写入
        //创建字节输入流(把数据从硬盘中读取到java内存)
        FileInputStream fis = new FileInputStream("D:/test1.txt");

        //使用字节流复制文件 一次读写一个字节
        //初始化读取数据之后返回的长度
//        int ch = -1;
//        while ((ch = fis.read()) != -1){//判断是否有数据
//            fos.write(ch);//如果有写入到硬盘
//        }

        //使用字节流一次读写一个数组
        byte[] bys = new byte[1024];
        int len = 0;//初始化读取数据之后返回的长度
        while ((len = fis.read(bys)) != -1){//判断是否有数据如果有，数据存放到字节数组，
            //写入数据到硬盘
            fos.write(bys,0,len);//写入一个字节指定长度数据到硬盘
        }

        //写入数据
//        for (int i = 97; i < 102; i++) {
//            fos.write(i);
//        }

        //释放资源
        fos.close();
        fis.close();
    }
}
