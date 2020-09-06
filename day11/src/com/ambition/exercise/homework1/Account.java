package com.ambition.exercise.homework1;

/**
 * @author 86176
 *
 * 1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，
 * 取款方法withdraw()，存款方法deposit()
 */
public class Account {
    private int id;
    private double balance;
    /**
     * 年利率
     */
    private double annualInterestRate;

    /**
     * 存款
     * @param amount 存款金额
     */
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("存款成功");
            System.out.println("您的余额为：" + balance);
        }
    }

    /**
     * 取款
     * @param amount 取款金额
     */
    public void withdraw(double amount){
        if (amount > 0){
            //取款金额小于存款
            if (amount <= balance){
                balance -= amount;
                System.out.println("取款成功\t余额：" + balance);
            }else {
                System.out.println("余额不足！");
                System.out.println("您的余额为：" + balance);
            }
        }else {
            System.out.println("输入数字不合法！");
        }
    }

    /**
     * @return 返回月利率
     */
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}
