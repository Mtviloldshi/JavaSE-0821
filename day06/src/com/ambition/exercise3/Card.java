package com.ambition.exercise3;

/*
    ## 第四题：语法练习

* 语法与技能：
  * 包、类（属性、构造器、方法）、对象、this
  * eclipse使用
* 在com.atguigu.test04.bean包中定义一个扑克Card类。
  * 属性：
    * 花色
    * 点数
  * 构造方法：
    * 满参构造方法
  * 成员方法：
    * showCard方法：打印牌面信息
* 在com.atguigu.test04.test包中定义测试类，创建Card对象，调用showCard方法。
 */
public class Card {
    String color;
    int pointerNumber;

    public Card() {

    }

    public Card(String color, int pointerNumber) {
        super();
        this.color = color;
        this.pointerNumber = pointerNumber;
    }

    public String ShowCard(String color, int pointerNumber) {
        return "花色:" + color + ",点数：" + pointerNumber;
    }
}
