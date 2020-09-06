package com.ambition.interfaces;

/**
 * u盘
 * @author
 */
public class Upan implements Usb{
    @Override
    public void service() {
        System.out.println("传输数据");
    }
}
