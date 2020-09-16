package com.ambition.http.test06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/15:23
 * @Description:
 *
 * 服务端
 */
public class DemoTcpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动了，等待接收数据");
        //1.创建socket对象,指定使用的端口哈皮
        ServerSocket serverSocket = new ServerSocket(1234);

        //2.接受一个socket
        Socket accept = serverSocket.accept();//堵塞方法

        //3.获取输入流
        InputStream is = accept.getInputStream();

        //4.读取数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));

        //反馈信息
        OutputStream os = accept.getOutputStream();
        os.write("收到".getBytes());

        os.close();

        //5.关闭资源
        is.close();
//        accept.close();
//        serverSocket.close();

    }
}
