package com.ambition.exercise.homework;

/*
    在提款方法withdraw()中，需要判断用户余额是否能够满足提款数额的要求，
    如果不能，应给出提示。deposit()方法表示存款。
 */
public class Account {
    private double balance;//余额

    public Account(double balance) {
        this.balance = balance;
    }

    //取款
    public boolean withdraw(double money) {
        if (money > 0) {//合法数字
            if (money <= balance) {//小于余额
                return true;
//                balance -= money;//取款
//                System.out.println("成功取款：" + money + "元\t余额：" + balance);
            } else {
//                System.out.println("取款失败，余额不足!");
                return false;
            }
        } else {
//            System.out.println("请输入合法金额！");
            return false;
        }
    }

    //存款
    public boolean deposit(double money) {
        if (money > 0) {
//            balance += money;
            return true;
        } else {
//            System.out.println("请输入合法数字！");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
