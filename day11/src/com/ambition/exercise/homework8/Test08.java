package com.ambition.exercise.homework8;

public class Test08 {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
class Fu{
    private static int i = getNum("（1）i");//i = 1  // i = 2
    private int j = getNum("（2）j");//j = 2
    static{
        print("（3）父类静态代码块"); //22 "（3）父类静态代码块"
    }
    {
        print("（4）父类非静态代码块，又称为构造代码块");// 66 "（4）父类非静态代码块，又称为构造代码块"
    }
    Fu(){
        print("（5）父类构造器"); //77 "（5）父类构造器"
    }
    public static void print(String str){
        System.out.println(str + "->" + i);//11  "（1）i --> 1"  //55 "（2）j --> 2"
    }
    public static int getNum(String str){
        print(str);
        return ++i;
    }
}
class Zi extends Fu{
    private static int k = getNum("（6）k");//k = 1 //k = 2
    private int h = getNum("（7）h");// h = 2
    static{
        print("（8）子类静态代码块");//44 "（8）子类静态代码块"
    }
    {
        print("（9）子类非静态代码块，又称为构造代码块"); //99 "（9）子类非静态代码块，又称为构造代码块"
    }
    Zi(){
        print("（10）子类构造器");// 1010 "（10）子类构造器"
    }
    public static void print(String str){
        System.out.println(str + "->" + k);//33 "（6）k --> 1" 88 "（7）h --> 2"
    }
    public static int getNum(String str){
        print(str);
        return ++k;
    }
}
