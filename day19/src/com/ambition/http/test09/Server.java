package com.ambition.http.test09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/16:32
 * @Description:
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888);

        while (true){
            //接收socket对象
            Socket accept = ss.accept();

            InputStream is = accept.getInputStream();

            //创建数据流
            DataInputStream dis = new DataInputStream(is);
            String fileName = dis.readUTF();

            BufferedInputStream bis = new BufferedInputStream(is);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/" + accept.getInetAddress().getHostName() + fileName + ".jpg"));

            //读写数据
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = bis.read(bys)) != -1){
                bos.write(bys,0,len);
            }

            bos.close();
            bis.close();

        }
    }
}
