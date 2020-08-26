package com.ambition.exercise;

import java.util.Scanner;

/*
=========ATM=======
        1、存款
        2、取款
        3、显示余额
        4、退出
        请选择：
 */
public class exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;
        double balance = 0;//账号余额
        while (isFlag) {

            System.out.println("==========ATM============");
            System.out.println("\t\t1.存款");
            System.out.println("\t\t2.取款");
            System.out.println("\t\t3.显示余额");
            System.out.println("\t\t4.退出");
            System.out.println("请选择：");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("---存款界面---");
                    System.out.println("请输入存款金额：");
                    balance += scan.nextDouble();
                    break;
                case 2:
                    System.out.println("----取款界面----");
                    int money = scan.nextInt();
                    if (balance > money){
                        balance -= money;
                    }else {
                        System.out.println("余额不足！");
                    }
                    break;
                case 3:
                    System.out.println("---显示余额---");
                    System.out.println("balance = " + balance);
                    break;
                case 4:
                    System.out.println("退出");
                    isFlag = false;
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
