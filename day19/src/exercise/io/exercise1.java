package exercise.io;

import org.junit.Test;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/12:59
 * @Description:
 *
 *      1. 指定GBK编码的转换流，读取文本文件。
 *      2. 使用UTF-8编码的转换流，写出文本文件。
 */
public class exercise1 {
    //用指定GBK编码转换流写出文本文件
    @Test
    public void writeTest() throws Exception {
        //创建字符转换输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");

        //写入GBK格式数据
        osw.write("hello 哈哈哈");

        osw.close();

    }

    //使用UTF-8编码转换流读取文本文件
    @Test
    public void readTest() throws Exception {
        //创建字节转换流，输入流。使用UTF-8读取文本数据到内存
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"GBK");

        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw1.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"),"UTF-8");

        char[] chs = new char[1024];
        int len = -1;
        while ((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
        }

        osw.close();
        isr.close();
    }
}
