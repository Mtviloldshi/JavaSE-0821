package com.ambition.exercise;
//第九题
public class Test9 {

    public static void main(String[] args) {
        int year = 2018;
        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }
    }

}
