package com.ambiton.test05eunm;

/**
 * @Author: ambitions
 * @Date: 2020/09/09/15:10
 * @Description:
 *
 *      jdk5之间使用枚举
 */
public class Demo1 {
    public static void main(String[] args) {
        //jdk1.5
        String s = Season.AUTUMN.toString();
        System.out.println(s);

        //jdk8
        Season2 s1 = Season2.AUTUMN;
        System.out.println(s1);//输出对象名
        //常用方法
        s1.name();//名字
        s1.ordinal();//序号
        Season2 winter = Season2.valueOf("WINTER");//通过枚举字符串获取枚举对象
        Season2[] values = Season2.values();//获取所有枚举对象
    }

}

//jdk5之后，使用关键字enum
enum Season2{

    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;
}

class Season{
    private String name;

    public final static Season SPRING = new Season("春");
    public final static Season SUMMER = new Season("夏");
    public final static Season AUTUMN = new Season("秋");
    public final static Season WINTER = new Season("东");

    @Override
    public String toString() {
        return name;
    }

    public Season(String name) {
        this.name = name;
    }

    private Season(){

    }
}
