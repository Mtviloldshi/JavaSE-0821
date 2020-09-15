package com.ambition.demo.io.test01file;

import java.io.File;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/14:19
 * @Description:
 *      File类:
 *          抽象表示的文件和目录的路径名。
 */
public class Demo {
    public static void main(String[] args) {
        //通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        File file = new File("E:/demo.java");
        //获取文件名
        System.out.println(file.getName());
        //判断文件是否存在
        System.out.println(file.exists());
        //从父路径名字符串和子路径名字符串创建新的 File实例。
        File file1 = new File("D:/hello","Demo.txt");
    }
}
