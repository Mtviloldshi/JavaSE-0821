package com.ambition.demo.io.test05filewrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/16:50
 * @Description:
 *
 *  字节流读取中文
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/test5.txt");
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = fis.read(bys)) != -1){
                for (int i = 0; i < bys.length; i++) {
                    System.out.print((char) bys[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fis.close();
        }




    }
}
