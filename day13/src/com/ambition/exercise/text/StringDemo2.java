package com.ambition.exercise.text;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: ambitions
 * @Date: 2020/09/08/19:25
 * @Description:
 */
public class StringDemo2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //将用户输入的单词全部转为小写，如果没有输入就重新输入
        while (true) {
            System.out.println("请输入单词:");
            String next = scanner.nextLine();
            if (!next.trim().equals("")) {
                System.out.println(next.toLowerCase());
                break;
            } else {
                System.out.println("你还未输入数据！");
            }
        }
    }

    @Test
    public void test1() {
        //生成随机验证码
        char[] arr = new char[26 * 2 + 10];
        //把数据存进数组
        //0-9
        for (int i = 0; i < 10; i++) {
            arr[i] = (char) ('0' + i);
        }
        //A - Z
        for (int i = 10, j = 0; i < 36; i++, j++) {
            arr[i] = (char) ('A' + j);
        }
        //a - z
        for (int i = 10 + 26, j = 0; i < arr.length; i++, j++) {
            arr[i] = (char) ('a' + j);
        }

        String code = "";
        //实例化随即类对象
        Random random = new Random();
        //筛选随机数
        for (int i = 0; i < 4; i++) {
            //随机数为数组可见长度角标
            int i1 = random.nextInt(arr.length);
            //连接验证码
            code += arr[i1];
        }
        System.out.println("验证码:" + code);
        System.out.println();
        System.out.println("请输入验证码:");
        String next = scanner.next();
        if (next.trim().equalsIgnoreCase(code)) {
            System.out.println("验证码正确！");
        } else {
            System.out.println("验证码错误");
        }
    }
}
