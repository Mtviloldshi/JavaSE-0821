package com.ambition.exercise.homework8;

public class Test {
    public static void main(String[] args) {
//        int i = 1;
//        int j = i++; //i = 1 放入操作栈, j = 1 ;运算完i自增1 i = 2
//        //   i=2放入操作栈;i自增1，i = 3; * j = 2; + i = 4; * j = 2放入操作栈 k = 3 * 2 + 4 * 2 = 14  运算完j自增1 j = 3 i = 4
//        int k = i++ * ++j + ++i * j++;
//        System.out.println("i = " + i);//4
//        System.out.println("j = " + j);//3
//        System.out.println("k = " + k);//14


//        int i = 1;
//        int j = i++;//j = 1 i = 2
//        // i = 2 * j = 2 + i = 2 * 2 k = 8  i = 2 j = 1
//        int k = i++ * ++j + --i * j--;
//        System.out.println("i = " + i);//2
//        System.out.println("j = " + j);//1
//        System.out.println("k = " + k);//8

//        int i = 1;
//                //2   +    2 *  4  +  4   j = 14 i=5
//        int j = ++i + i++ * ++i + i++;
//        System.out.println("i = " + i);//5
//        System.out.println("j = " + j);//14

        int i = 0;
        int result = ++i/--i;
        System.out.println("result="+result);
    }
}
