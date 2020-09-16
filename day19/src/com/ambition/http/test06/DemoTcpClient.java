package com.ambition.http.test06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/15:19
 * @Description:
 * 客户端
 */
public class DemoTcpClient {
    public static void main(String[] args) throws IOException {
        //1.创建socket对象,指定对方IP的端口
        Socket socket = new Socket("127.0.0.1",1234);

        //2.获取输出流
        OutputStream os = socket.getOutputStream();

        //3.写入数据
        os.write("hello tcp".getBytes());

        //接收反馈信息
        InputStream is = socket.getInputStream();
        byte[] bus = new byte[1024];
        int read = is.read(bus);
        System.out.println(new String(bus,0, read));


        //4.关流
        is.close();
        os.close();

        //5.关闭socket
        socket.close();
    }
}
