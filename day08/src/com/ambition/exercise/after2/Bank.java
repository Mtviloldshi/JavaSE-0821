package com.ambition.exercise.after2;

/*
    （1）声明一个银行储蓄卡类，
        包含属性：账户，余额
        包含取款 public void withdraw(double money)
        存款 pubic void save(double money)
        获取账户信息： public String getInfo() 可以返回账户和余额
 */
public class Bank {
    private int count;//账户
    private double balance;//余额

    public Bank(int count, double balance) {
        super();
        this.count = count;
        this.balance = balance;
    }

    //取款
    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("余额不足！");
        } else if (money < 1) {
            System.out.println("请输入正确金额!");
        } else {
            balance -= money;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void save(double money) {
        if (money > 0) {
            balance += money;
        } else {
            System.out.println("请输入正确金额！");
        }
    }

    //获取账户信息
    public String getInfo() {
        if (balance < 0) {
            return "账户：" + count + "\t已透支：" + (-balance);
        } else
            return "账户：" + count + "\t余额：" + balance;
    }
}
