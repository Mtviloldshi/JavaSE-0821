package com.ambition.variable;

public class DemoChinese {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();

        System.out.println(chinese.name);//null
        System.out.println(chinese.age);//18
        System.out.println(chinese.country);//不推荐
        System.out.println(Chinese.country);//推荐 类名.变量名

        Chinese chinese1 = new Chinese();

        System.out.println(chinese1.name);
        System.out.println(chinese1.age);
        System.out.println(chinese1.country);

    }
}
