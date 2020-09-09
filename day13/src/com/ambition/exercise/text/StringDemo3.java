package com.ambition.exercise.text;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/20:01
 * @Description:
 *
 * 2、系列2：查找
 * （11）boolean contains(xx)：是否包含xx
 * （12）int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返
 * 回-1
 * （13）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没
 * 有返回-1
 *
 * 3、系列3：字符串截取
 * （14）String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截
 * 取到最后的一个子字符串。
 * （15）String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从
 * beginIndex开始截取到endIndex(不包含)的一个子字符串。
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "hello java";

//        11）boolean contains(xx)：是否包含xx
        System.out.println(str.contains("hello"));
//       （12）int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
        System.out.println(str.indexOf("l"));
//        （13）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没
        System.out.println(str.lastIndexOf("l"));

//        * （14）String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
        System.out.println(str2.substring(5));
//        （15）String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从
//        beginIndex开始截取到endIndex(不包含)的一个子字符串。
        System.out.println(str2.substring(3,6));
//    }
    }

    @Test
    public void test1() throws UnsupportedEncodingException {
        String str = "hello world";
        String str2 = "hello java";
//        （16）char charAt(index)：返回[index]位置的字符
        System.out.println(str.charAt(5));
//（17）char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
        System.out.println(str.toCharArray()[0]);
//（18）String(char[] value)：返回指定数组中表示该字符序列的 String。
        System.out.println(new String(new char[5]));
//（19）String(char[] value, int offset, int count)：返回指定数组中表示该字符序列的 String。
        System.out.println();
//（20）static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
//（21）static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列
//        的 String
//（22）static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的
//                String
//（23）static String valueOf(char[] data) ：返回指定数组中表示该字符序列的 String

//        5、系列5：编码与解码
//（24）byte[] getBytes()：编码，把字符串变为字节数组，按照平台默认的字符编码进行编码
        System.out.println(Arrays.toString(str.getBytes("GBK")));
        System.out.println(str.getBytes().toString());
//        byte[] getBytes(字符编码方式)：按照指定的编码方式进行编码
//（25）new String(byte[] ) 或 new String(byte[], int, int)：解码，按照平台默认的字符编码进行解码
        System.out.println();
//        new String(byte[]，字符编码方式 ) 或 new String(byte[], int, int，字符编码方式)：解码，按照指定的
//                编码方式进行解码

//        6、系列6：开头与结尾
//（26）boolean startsWith(xx)：是否以xx开头
        System.out.println(str.startsWith("he"));
//（27）boolean endsWith(xx)：是否以xx结尾
        System.out.println(str.endsWith("d"));
    }
}
