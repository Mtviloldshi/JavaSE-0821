package com.ambition.exercise.text2;

import org.junit.Test;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/20:49
 * @Description:
 * 10.2.2 常用API
 * 常用的API，StringBuilder、StringBuffer的API是完全一致的
 * （1）StringBuffer append(xx)：拼接，追加
 * （2）StringBuffer insert(int index, xx)：在[index]位置插入xx
 * （3）StringBuffer delete(int start, int end)：删除[start,end)之间字符
 * StringBuffer deleteCharAt(int index)：删除[index]位置字符
 * （4）void setCharAt(int index, xx)：替换[index]位置字符
 * （5）StringBuffer reverse()：反转
 * （6）void setLength(int newLength) ：设置当前字符序列长度为newLength
 * （7）StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
 * （8）int indexOf(String str)：在当前字符序列中查询str的第一次出现下标
 * int indexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
 * int lastIndexOf(String str)：在当前字符序列中查询str的最后一次出现下标
 * int lastIndexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的最后一次出
 * 现下标
 * （9）String substring(int start)：截取当前字符序列[start,最后]
 * （10）String substring(int start, int end)：截取当前字符序列[start,end)
 * （11）String toString()：返回此序列中数据的字符串表示形式
 */
public class StringBufferAndStringBuilder {
    @Test
    public void test2() {
        StringBuilder stringBuilder = new StringBuilder("hello");
        StringBuffer stringBuffer = new StringBuffer("world");
//        * （8）int indexOf(String str)：在当前字符序列中查询str的第一次出现下标
        System.out.println(stringBuilder.indexOf("o"));
        System.out.println(stringBuffer.indexOf("o"));
// * int indexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
        System.out.println(stringBuffer.indexOf("o",3));
        System.out.println(stringBuilder.indexOf("o",3));
// * int lastIndexOf(String str)：在当前字符序列中查询str的最后一次出现下标
        System.out.println(stringBuilder.lastIndexOf("o"));
        System.out.println(stringBuffer.lastIndexOf("o"));
// * int lastIndexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的最后一次出现下标
        System.out.println(stringBuffer.lastIndexOf("o",3));
        System.out.println(stringBuilder.lastIndexOf("o",3));
// * （9）String substring(int start)：截取当前字符序列[start,最后]
        System.out.println(stringBuilder.substring(0));
        System.out.println(stringBuffer.substring(0));
// * （10）String substring(int start, int end)：截取当前字符序列[start,end)
        System.out.println(stringBuilder.substring(0,5));
        System.out.println(stringBuffer.substring(0,5));
// * （11）String toString()：返回此序列中数据的字符串表示形式
    }
    @Test
    public void test(){
        StringBuilder stringBuilder = new StringBuilder("hello");
        StringBuffer stringBuffer = new StringBuffer("world");
//                * （1）StringBuffer append(xx)：拼接，追加
        System.out.println(stringBuffer.append("124"));
        System.out.println(stringBuilder.append("124"));
//                * （2）StringBuffer insert(int index, xx)：在[index]位置插入xx
        System.out.println(stringBuilder.insert(3,"222"));
        System.out.println(stringBuffer.insert(3,"222"));
//                * （3）StringBuffer delete(int start, int end)：删除[start,end)之间字符
//                * StringBuffer deleteCharAt(int index)：删除[index]位置字符
        System.out.println(stringBuffer.delete(0,1));
        System.out.println(stringBuilder.delete(0,1));

        System.out.println("-----------------------");

// * （4）void setCharAt(int index, xx)：替换[index]位置字符
        stringBuffer.setCharAt(0, '1');
        stringBuilder.setCharAt(0,'1');
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
// * （5）StringBuffer reverse()：反转
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
// * （6）void setLength(int newLength) ：设置当前字符序列长度为newLength
        stringBuilder.setLength(10);
        stringBuffer.setLength(10);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuilder.length());
// * （7）StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
        System.out.println(stringBuilder.replace(0,2,"he"));
        System.out.println(stringBuffer.replace(0,2,"wo"));

    }
}
