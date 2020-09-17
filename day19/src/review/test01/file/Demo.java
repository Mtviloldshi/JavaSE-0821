package review.test01.file;

import org.junit.Test;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/15:30
 * @Description:
 *
 *  将GBK文件中的数据 读取到UTF-8文件中
 */
public class Demo {
    //存入GBK编码数据进文档
    @Test
    public void test() throws Exception{
        //创建字节转换 输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/gbk.txt"),"GBK");

        //写入数据
        osw.write("哈哈哈  hello..");


        osw.close();
    }

    //将GBK编码数据写入到UTF-8编码文档
    @Test
    public void test2() throws Exception{
        //创建字符转换输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:/gbk.txt"),"GBK");

        //创建输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/utf_8.txt"),"UTF-8");

        //写入数据
        char[] chs = new char[1024];
        int len = -1;
        while((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
        }

        osw.close();
        isr.close();
    }
}
