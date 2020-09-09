package com.ambition.demo.test02string;

import org.junit.Test;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/10:22
 * @Description:
 *      String常用方法
 *  （1）boolean isEmpty()：字符串是否为空
 * （2）int length()：返回字符串的长度
 * （3）String concat(xx)：拼接，等价于+
 * （4）boolean equals(Object obj)：比较字符串是否相等，区分大小写
 * （5）boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，区分大小写
 * （6）int compareTo(String other)：比较字符串大小，区分大小写，按照Unicode编码值比较大小
 * （7）int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
 * （8）String toLowerCase()：将字符串中大写字母转为小写
 * （9）String toUpperCase()：将字符串中小写字母转为大写
 * （10）String trim()：去掉字符串前后空白符
 *
 *  2.//查找
 *  （11）boolean contains(xx)：是否包含xx
 * （12）int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
 * （13）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
 *
 * 3、系列3：字符串截取
 * （14）String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截
 * 取到最后的一个子字符串。
 * （15）String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从
 * beginIndex开始截取到endIndex(不包含)的一个子字符串。
 *
 * 4、系列4：和字符相关
 * （16）char charAt(index)：返回[index]位置的字符
 * （17）char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
 * （18）String(char[] value)：返回指定数组中表示该字符序列的 String。
 * （19）String(char[] value, int offset, int count)：返回指定数组中表示该字符序列的 String。
 * （20）static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
 * （21）static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列
 * 的 String
 * （22）static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的
 * String
 * （23）static String valueOf(char[] data) ：返回指定数组中表示该字符序列的 String
 *
 * 5、系列5：编码与解码
 *          编码: 把字符串转换为字节
 *          解码: 把字节转换为字符串
 * （24）byte[] getBytes()：编码，把字符串变为字节数组，按照平台默认的字符编码进行编码
 * byte[] getBytes(字符编码方式)：按照指定的编码方式进行编码
 * （25）new String(byte[] ) 或 new String(byte[], int, int)：解码，按照平台默认的字符编码进行解码
 *
 * 6、系列6：开头与结尾
 * （26）boolean startsWith(xx)：是否以xx开头
 * （27）boolean endsWith(xx)：是否以xx结尾
 *
 * 8、系列8：替换
 * （29）String replace(xx,xx)：不支持正则
 * （30）String replaceFirst(正则，value)：替换第一个匹配部分
 * （31）String repalceAll(正则， value)：替换所有匹配部分
 *
 * 9、系列9：拆分
 * （32）String[] split(正则)：按照某种规则进行拆分
 */
public class Demo1 {
    /**
     * 数组的length(属性) 和 字符串的length(方法)
     */

    @Test
    public void test(){
        //11）boolean contains(xx)：是否包含xx
        String str = "1231486151";
        boolean contains = str.contains("8");
        System.out.println(contains);

        //int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
        int i = str.indexOf("6");
        System.out.println(i);

        //（13）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
        int i1 = str.lastIndexOf("1");
        System.out.println(i1);
    }


    @Test
    public void test1(){
//        14）String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截
//                * 取到最后的一个子字符串。
// *    （15）String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从
//                * beginIndex开始截取到endIndex(不包含)的一个子字符串。
        String str = "1231486151";
        String substring = str.substring(3);
        System.out.println(substring);

        //截取范围一般包前不包后
        String substring1 = str.substring(3, 7);
        System.out.println(substring1);

        String st = "11" + new String("222");
        System.out.println(st);
    }
}
