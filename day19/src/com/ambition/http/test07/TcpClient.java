package com.ambition.http.test07;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/15:42
 * @Description:
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1234);

        OutputStream os = socket.getOutputStream();
        os.write("czq".getBytes());

        os.close();
        socket.close();
    }
}
