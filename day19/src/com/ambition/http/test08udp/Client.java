package com.ambition.http.test08udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/16:11
 * @Description:
 *
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //客户端socket对象
        DatagramSocket ds = new DatagramSocket();

        //发送的数据打包
        byte[] bytes = "zttovo".getBytes();//要发送的数据
        //对方IP
        InetAddress ip = InetAddress.getByName("192.168.19.40");
        DatagramPacket p = new DatagramPacket(bytes,bytes.length,ip,9999);
        ds.send(p);

        //释放资源
        ds.close();
    }
}
