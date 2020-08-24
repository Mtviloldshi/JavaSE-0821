package com.ambition.node;

/*
 * 强制类型转换
 * 		*强制类型转换：大范围的数值类型转小范围的数值类型，需要进行强制类型转换
 *强制转换容易损失精度，除非你确保强转后还是你想要的结果
 */
public class Demo2 {

    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.println(b);

        int i1 = 128;
        byte b2 = (byte) i1;//精度丢失
        System.out.println(b2);//-128

        int i3 = 1;
        int i4 = 2;

        //double d = i3/i4;//0.0
        double d = (double)i3/i4;
        System.out.println(d);

        System.out.println('a' + 'b');//195

        System.out.println("a" + 123 + 'b' + 3.4);//字符串跟任意数据类型拼接都是字符串
//

    }

}
