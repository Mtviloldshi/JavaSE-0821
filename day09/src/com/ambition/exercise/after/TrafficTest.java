package com.ambition.exercise.after;

/*
    （3）在测试类的main中创建一个数组，有各种交通工具，遍历调用drive()方法 模拟马路上跑
    的各种交通工具
 */
public class TrafficTest {
    public static void main(String[] args) {
        //方式一
//        Traffic bi = new Bicycle();
//        Traffic c1 = new Car();
//        Traffic[] obj = {bi, c1};

        //方式二
        //右边使用 匿名对象来初始化十足
        Traffic[] obj = {new Bicycle(), new Car()};
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length; j++) {
                obj[j].drive();
            }
        }
    }
}
