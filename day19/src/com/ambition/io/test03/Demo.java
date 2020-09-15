package com.ambition.io.test03;

import java.io.*;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/11:08
 * @Description:
 *
 *  数据流: 读取顺序要与写入顺序一致，否则乱码
 *      DataOutputStream:可以把Java的数据类型写入文件
 *      DateInputStream:可以把Java的数据类型读取出来
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        byte b = 11;
        int a = 10;
        long c = 12;
        char d = 'a';
        boolean e = true;
        String str= "hello";
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
        dos.writeByte(b);
        dos.writeInt(a);
        dos.writeLong(c);
        dos.writeChar(d);
        dos.writeBoolean(e);
        dos.writeUTF(str);

        int read = dis.read();
        System.out.println(read);

        dos.close();
    }
}
