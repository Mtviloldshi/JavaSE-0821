package com.ambition.exercise.ing;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/22:16
 * @Description:
 *  //输出一个字符串在另一个字符串当中出现的次数
 */
public class StringExercise {
    public static void main(String[] args) {
        //输出一个字符串在另一个字符串当中出现的次数
        String str1 = "sa";
        String str2 = "asdasfasasdsasasasas";

        //初始化统计次数
        int count = 0;
        //循环字符串内容
        for (int i = 0; i < str2.length(); i += str1.length() - 1) {
            //拿到新新角标 截取字符串
            str2 = str2.substring(i);
            //比较字符串,返回相同字符串的角标
            int index = str2.indexOf(str1);
            if (index != -1) {
                count++;//把已找到的字符串角标加1 赋给截取角标
                i = index + 1;
            }
        }
        System.out.println(count);
    }
}
