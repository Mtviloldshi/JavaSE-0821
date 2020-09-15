package com.ambition.demo.io.test02in_ouput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/14:39
 * @Description:
 *
 *  IO:输入输出
 *  分类：
 *      根据流向分：
 *          输入流：硬盘到内存（Java程序）
 *              InputStream 抽象类
 *                  FileInputStream : 用于读取文件中的数据
 *                      FileInputStream(file)
     *                  FileInputStream(String file)
     *                  read();//读取一个字节
     *                  read(byte[] arr);//读取多个数据到字节数组，返回数据个数
 *              Reader 抽象类
 *                  FileReader:读取文件中的数据，按字符读取
 *                      FileReader(String file);
 *                      read();//读取一个字符
 *                      read(char[] chs);//读取一个字符数组
 *          输出流：（Java程序）内存到硬盘
 *              OutputStream c抽象类
 *                  FileOutputStream 用于往文件写数据
 *                      FileOutputStream(File file)
 *                      FileOutputStream(String file)
 *                      FileOutputStream(String file,boolean append)//追加写入，第二参数为true
 *                      write(int i);//写一个字节
 *                      write(byte[] bys);//写一个字节数组到文件中
 *                      write(byte[] bys,int off,int len);//写一个字节数组的一部分数据到文件中
 *             Write 抽象类
 *                  FileWrite:用于向文件中写数据，按照字符写
 *                      FileWrite(File file);
 *                      FileWrite(String file);
 *                      FileWrite(String file,boolean append);追加写入，第二参数为true
 *                      write();//写一个字符到文件中
 *                      write(char[] chs);//写一个字符数组到文件中
 *                      write(char[] chs,int off,int len);//写一个字符数组部分数据到文件中
 *      根据操作的拘束类型划分：
 *          字节流：数据以字节为单位进行传输
 *          字符流：数据以字符为单位进行传输
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/test.txt");
        if (!file.exists()){
            boolean newFile = file.createNewFile();
        }
        //FileOutputStream(File file)
        //创建一个文件输出流写入指定的 File对象表示的文件。
        //创建一个字符输出流
        FileOutputStream fos = new FileOutputStream(file);
        //写数据到流中（文件）
        fos.write(97);

        byte[] bytes = {97,98,99,100};
//        fos.write(bytes);//一次写一个字节数组
        fos.write(bytes,0,2);
        //释放资源,关闭流
        fos.close();
    }
}
