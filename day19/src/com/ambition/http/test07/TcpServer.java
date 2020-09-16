package com.ambition.http.test07;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/15:43
 * @Description:
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);

        Socket accept = null;
        for (;;){
            accept = ss.accept();//阻塞方法，等待接收socket

            String ip = accept.getInetAddress().getHostAddress();//获取ip地址
            System.out.println("来自ip" + ip);
            InputStream is = accept.getInputStream();//通过socket来接受数据
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = is.read(bytes)) != -1){
                //显示打印对方
                System.out.println("ip" + ip + ":" + new String(bytes,0,len));
            }
        }

    }
}
