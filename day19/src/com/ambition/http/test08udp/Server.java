package com.ambition.http.test08udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/16:15
 * @Description:
 *
 * 服务器端
 *      UDP特点：
 *          非面向连接，效率高，不安全，一次可以发送的数据量有限
 */
public class Server {
    public static void main(String[] args) throws Exception {
        //1.服务端socket对象，指定使用端口
        DatagramSocket ds = new DatagramSocket(9999);

        //2.创建DatagramPacket用于接收
        byte[] bys = new byte[1024];
        DatagramPacket p = new DatagramPacket(bys, bys.length);
        //3.接收数据到包裹中
        ds.receive(p);

        //4.解析数据
        InetAddress ip = p.getAddress();//对方ip地址
        byte[] data = p.getData();//数据
        int length = p.getLength();//数据长度

        //5.输出数据到控制台
        System.out.println("来自ip:" + ip.getHostName());
        System.out.println(new String(data,0,length));

        //6.释放资源
        ds.close();
    }
}
