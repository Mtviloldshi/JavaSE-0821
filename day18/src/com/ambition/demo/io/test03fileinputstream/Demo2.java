package com.ambition.demo.io.test03fileinputstream;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/15:41
 * @Description:
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //字节输入流
        FileInputStream fis = new FileInputStream("D:test2.txt");
        //读取数据
        //读一个字节数组
        byte[] bus = new byte[2];
        int len = fis.read(bus);//返回读取的数据长度
        System.out.println(len);
        System.out.println(bus[0]);
        System.out.println(bus[1]);
    }
}
