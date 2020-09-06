package com.ambition.interfaces;

/**
 * 计算机类
 * @author 86176
 */
public class Computer {
    /**
     *  usb接口
     */
    private Usb usb;

    public Usb getUsb() {
        return usb;
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
    }

    public void work(){
        usb.service();
    }
}
