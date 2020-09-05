package com.ambition.exercise.homework;

import sun.text.resources.cldr.lg.FormatData_lg;

import java.util.Scanner;

/*
    测试类
 */
public class BankTest {
    Scanner scan = new Scanner(System.in);
    Bank bank = new Bank(10);

    Customer custome = null;


    public static void main(String[] args) {
        BankTest bankTest = new BankTest();
        bankTest.enuml();
    }

    public void enuml() {
        boolean flag = true;
        do {
            System.out.println("--------------------账户管理系统----------------\n");
            System.out.println("                    1.添加客户");
            System.out.println("                    2.取款");
            System.out.println("                    3.存款");
            System.out.println("                    4.获取用户");
            System.out.println("                    5.退出\n");
            System.out.print("请选择(1-5):");
            switch (CMUtility.readMenuSelection()) {
                case '1':
                    //添加客户
                    addCustomer();
                    break;
                case '2':
                    //取款
                    withdraw();
                    break;
                case '3':
                    //存款
                    deposit();
                    break;
                case '4':
                    //获取用户
                    getCustomer();
                    break;
                case '5':
                    //退出
                    System.out.println("是否确认退出?(Y/N):");
                    if (CMUtility.readChar() == 'Y') flag = false;
                    break;
            }
        } while (flag);
    }

    //添加用户
    public void addCustomer() {
        System.out.println("-----------------添加用户----------------\n");
        System.out.print("输入用户姓：");
        String f = CMUtility.readString(10);
        System.out.print("输入用户名：");
        String l = CMUtility.readString(10);
        //获取返回值
        boolean flag = bank.addCustomer(f, l);
        if (flag) {
            System.out.println("-----------------添加成功----------------");
        } else {
            System.out.println("-----------------添加失败----------------");
        }
    }

    //获取用户
    public void getCustomer() {
        System.out.println("-----------------获取用户----------------\n");
        int number = -1;
        for (; ; ) {
            System.out.println("请输入用户编号：");
            number = CMUtility.readInt();
            custome = bank.getCustome(number - 1);
            if (number == -1) {
                return;
            } else if (custome != null) {
                break;
            } else {
                System.out.println("查无此用户！");
            }
        }
        System.out.println("编号\t姓\t名\t余额");
        System.out.println(number + "\t" + custome.getLastName() + "\t" + custome.getFirstName() + "\t" + custome.getAccount().getBalance());
    }

    //存款
    public void deposit() {
        //输入存款用户编号
        //获取存款用户
        //选择是否定期 定期--> 余额 = 余额 + （余额 + money * 年利率） 不定期 余额 = 余额 + money
        //存钱 --> 余额 = 余额 + 余额 * 年利率
        System.out.println("-----------------存款-----------------\n");
        System.out.println("请输入存款金额：");
        int money = scan.nextInt();//接收金额
        custome = bank.getCustome(0);
        custome.setAccount(new SavingsAccount(this.custome.getAccount().getBalance(), 0.34));
        boolean flag = custome.getAccount().deposit(money);
        if (flag) {
            //设置新余额
            this.custome.getAccount().setBalance(this.custome.getAccount().getBalance() + money + (this.custome.getAccount().getBalance() + money) * 0.34);
            System.out.println("-----------------存款成功-----------------");
        } else {
            System.out.println("-----------------存款失败------------------");
        }
    }

    //取款
    public void withdraw() {
        System.out.println("-----------------取款----------------\n");
        //输入取款顾客编号
        //获取取款顾客
        //调用取款方法 获取返回值
        //判断返回值 设置余额
        System.out.println("请输入取款金额:");
        int money = scan.nextInt();
        custome = bank.getCustome(0);
        custome.setAccount(new CheckingAccount(custome.getAccount().getBalance(), 1000));
        //调用取款方法并获取返回值
        boolean flag = custome.getAccount().withdraw(money);
        if (flag) {
            //设置新余额
            custome.getAccount().setBalance(custome.getAccount().getBalance() - money);
            System.out.println("-----------------取款成功----------------");
        } else {
            System.out.println("-----------------取款失败----------------");
        }
    }
}
