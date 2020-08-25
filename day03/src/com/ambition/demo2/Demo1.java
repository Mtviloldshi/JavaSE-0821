package com.ambition.demo2;

/*
    switch的使用
      break：跳出switch范围
      switch (week)：week 可使用的数据类型
            byte short int char String 枚举
      case 变量：变量具有唯一性
 */
public class Demo1 {
    public static void main(String[] args) {
        int week = 1;
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        System.out.println("程序结束");
    }
}
