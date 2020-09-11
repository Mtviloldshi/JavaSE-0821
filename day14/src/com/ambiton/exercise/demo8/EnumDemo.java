package com.ambiton.exercise.demo8;

/**
 * @Author: ambitions
 * @Date: 2020/09/10/10:18
 * @Description:
 *
 * 1.toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！
 * 2.name():返回的是常量名（对象名） 【很少使用】
 * 3.ordinal():返回常量的次序号，默认从0开始
 * 4.values():返回该枚举类的所有的常量对象，返回类型是当前枚举的数组类型，是一个静态方法
 * 5.valueOf(String name)：根据枚举常量对象名称获取枚举对象
 */
public class EnumDemo {
    public static void main(String[] args) {
        Season[] values = Season.values();
        //values 返回该枚举类的所有的常量对象，返回类型是当前枚举的数组类型，是一个静态方法
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //根据枚举常量对象名称获取枚举对象
        Season season = Season.valueOf("SPRING");
        //返回常量的次序号，默认从0开始
        int ordinal = season.ordinal();
        System.out.println(ordinal);
        //返回的是常量名（对象名） 【很少使用】
        String name = season.name();
        System.out.println(name);

        System.out.println(season.toString());

    }
}

enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
