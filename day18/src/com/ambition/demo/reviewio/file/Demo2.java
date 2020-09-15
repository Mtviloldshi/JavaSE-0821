package com.ambition.demo.reviewio.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/19:13
 * @Description:
 *
 * 字节输出流：以字节的方式将java内存文件写入到系统硬盘
 *      OutputStream :抽象类
 *          FileOutputStream(File file);//实现类
 *          FileOutputStream(String file);
 *          FileOutputStream(String file,boolean append);//追加写入
 *              write(int i);//将一个字节数据写入到系统硬盘文件
 *              write(byte[] bys);//将一个字节数组写入到系统文件
 *              write(byte[] bys,int off,int len);//将一个字节数组的部分数据写入到系统文件
 *  字节输入流：将系统文件内容，读取到Java内存
 *      InputStream:抽象类
 *          FileInputStream(String file);//实现类，构造方法，读取系统文件file内容到Java内存
 *          FileInputStream(File file);
 *              read(int i);//从系统文件读取一个字节到Java内存
 *              read(byte[] bys);//从系统文件读取数据到一个字节数组放到Java内存
 *              read(byte[] bys,int off,int len);从系统文件读取数据到一个字节数组的部分内容放到Java内存
 *  字符输出流:将java内存数据写入到系统内存
 *      Write:抽象类
 *          FileWrite(File file);//实现类，构造方法，如指定读取到file文件中，如果还没有这个file，则创建
 *          FileWrite(String file);//
 *          FileWrite(String file,boolean );//追加写入
 *              write(char i);//写入一个字符到系统文件
 *              write(String str);//写入一个字符串到系统文件
 *              write(char[] str);//写入一个字符数组到系统文件
 *              write(char[] str,int off,int len);//写入一个字符数组部分内容到系统文件
 *  字符输入流: 将系统文件数据读取到Java内存.
 *      Reader:抽象类
 *          FileReader(File file);//实现类，构造方法，从file文件中读取数据
 *          FileReader(String file);//实现类，构造方法，从file文件中读取数据
 *              read(char i);//读取一个字符到Java内存
 *              read(char[] i);//读取数据到字符数组，放入到Java内存
 *              read(char[] i,int off,int len);//读取数据到字符数组,部分数据放入到Java内存
 *
 *   字符流与字节流区别：
 *      字符流：以字符为单位读写数据
 *             只能操作文本文件，不能操作图片，视屏等非文本文件
 *      字节流：以字节为单位读写数据
 *   注意：
 *      当完成流操作的时候，必须调用close()方法释放资源
 *          流的关闭原则：先开后关，后关先开
 *      图片用字节流传输
 *      当我们单纯读或者写文本文件时 使用字符流 其他情况使用字节流
 */
public class Demo2 {
    //复制图片
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = new FileInputStream("D:/test.JPG");
        //创建字节输入流
        FileOutputStream fos = new FileOutputStream("D:/test_copy.JPG");

        //写入数据
        byte[] bys = new byte[1024];//创建字节数组，把数据读写到字节数组
        int len = 0;//初始化读取数据返回值
        while ((len = fis.read(bys)) != -1){//判断是否有数据，读取到的长度赋给len
            fos.write(bys,0,len);//写入读取到的数据
        }


        //释放资源
        fos.close();
        fis.close();
    }
}
