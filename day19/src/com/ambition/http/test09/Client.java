package com.ambition.http.test09;

import java.io.*;
import java.net.Socket;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/16:27
 * @Description:
 *
 * 文件上传
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.19.49",8888);

        File file = new File("D:/网抑云.jpg");
        String fileName = file.getName();

        OutputStream os = socket.getOutputStream();
        //数据流用于发送文件名
        DataOutputStream dos = new DataOutputStream(os);

        //发送文件名
        dos.writeUTF(fileName);

        //发送文件数据
        BufferedOutputStream bw = new BufferedOutputStream(os);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bw.write(bys,0,len);
        }

        bis.close();
        os.close();
        socket.close();
    }
}
