package com.ambition.demo.test02string;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/10:07
 * @Description:
 * 1.构造方法创建字符串
 *  public String() ：初始化新创建的 String对象，以使其表示空字符序列。
 *  String(String original) ： 初始化一个新创建的 String 对象，使其表示一个与参数相
 *  同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
 *  public String(char[] value) ：通过当前参数中的字符数组来构造新的String。
 *  public String(char[] value,int offset, int count) ：通过字符数组的一部分来构
 *  造新的String。
 *  public String(byte[] bytes) ：通过使用平台的默认字符集解码当前参数中的字节数组
 *  来构造新的String。
 *  public String(byte[] bytes,String charsetName) ：通过使用指定的字符集解码当前
 *  参数中的字节数组来构造新的String。
 *
 *  2. 通过+
 *      字符串跟任何类型数据通过 + 连接 结果为字符串
 */
@SuppressWarnings(value = "all")
public class Demo2 {
    public static void main(String[] args) {
        char[] chs = {'a','b','c'};
        String s3 = new String(chs);//传入数组，转换为字符串
        System.out.println(s3);//输出字符串

        String s4 = new String(chs, 0, 2);//从角标到结束角标转换字符串

        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);//字节转换字符串
        String s6 = new String(bytes,0,2);//从角标到结束角标转换字符串
    }
}
