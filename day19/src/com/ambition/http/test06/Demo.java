package com.ambition.http.test06;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: ambitions
 * @Date: 2020/09/15/15:14
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        //获取主机IP地址对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);
    }
}
