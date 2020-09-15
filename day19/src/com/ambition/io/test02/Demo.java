package com.ambition.io.test02;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/10:41
 * @Description:
 *
 *  //转换流，本质上还是字符流，字符流本质上还是读取字节在结合编码表转化为字符
 */
public class Demo {

    @Test
    public void test1() throws IOException {
        //转换流，读取字节转换为字符
        InputStreamReader isr = new InputStreamReader(new FileInputStream("bw.txt"));
        int read = isr.read();
        System.out.println(read);
        System.out.println(isr.getEncoding());
    }
}
