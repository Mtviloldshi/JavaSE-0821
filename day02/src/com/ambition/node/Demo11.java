package com.ambition.node;
//位运算符:效率比较高
public class Demo11 {

    public static void main(String[] args) {
        int a = 1&2;//按位与
        //0001
        //0010
        //0000

        System.out.println(a);//0
        int b = 3&5;
        //0011
        //0101
        //0001
        System.out.println(b);//1

        int c=1|2;
        //0001 10-->2
        //0010			进制转换
        //0011 2-->10
        System.out.println(c);//3

        byte f = ~5;
        //0000 0101
        //1111 1010 补码
        //1111 1001 减一反码
        //1000 0110 源码
        System.out.println(f);

        //练习
        int i = 1;
        int j = i++; //j = 1,i=2
        //先加载完所有自增自减数值，然后按照先乘除后加减方式进行计算
        //      2 *    2  +  4   *  2
        int k = i++ * ++j + ++i * j++;
        //i=2放入操作栈i自增1 i = 3，j=2放入操作栈，i=4放入操作栈，j=2放入操作栈，然后j自增1，j=3
        System.out.println("i = " + i);//4
        System.out.println("j = " + j);//3
        System.out.println("k = " + k);//12
    }

}
