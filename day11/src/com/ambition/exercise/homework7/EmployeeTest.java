package com.ambition.exercise.homework7;

/**
 * @author 86176
 *
 * 、在com.atguigu.test16包中声明Test16类，并在main中创建每一个类的对象，并为属性赋值，并调用它们的getInfo()显示信息b
 */
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("职位\t\t编号\t\t姓名\t\t年龄\t\t薪资\t\t编程语言\t\t奖金\t\t股票数");
        System.out.println(new Programmer("程序员", 1234, "cyq", 18, 8000).toString());
        System.out.println(new Designer("设计师", 7895, "pop", 20, 10000, 2000).toString());
        System.out.println(new Architect("架构师", 4561, "cyq", 25, 20000, 5000, 100).toString());
    }
}
