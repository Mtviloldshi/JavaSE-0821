package com.ambition.exercise.homework8;

public class T {
    public static int k = 0;//k = 4 k = 5 k = 6 k = 7
    public static T t1 = new T("t1");
    public static T t2 = new T("t2");
    public static int i = print("i");//i = 1 i = 2 i = 3 i = 4 i = 5 i = 6 i = 7 i = 8
    public static int n = 99;//n =  100 n = 101 n = 102 n = 103 n = 104 n = 105 n = 106 //n=107

    public int j = print("j"); //33 " 3 : j  i=2 n=101" 66 " 5 : j  i=6 n=105"
    {
        print("构造块");//44 "4 : 构造块 i=3 n =102" //77  "6 : 构造块 i=7 n =106"
    }

    static{
        print("静态块"); //22 " 2 : 静态块   i=1 n=100"
    }
    public T(String str){
        //55 "4:t2 + i=5 n=104" //88 "7 :t1 + i=8 n=107"
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);
        ++n;
        ++i;
    }
    public static int print(String str){
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);//11 "1 :  i=0 n=0"
        ++n;
        return ++i;
    }
    public static void main(String[] args) {

    }
}