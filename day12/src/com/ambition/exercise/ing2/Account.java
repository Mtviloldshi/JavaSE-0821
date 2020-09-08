package com.ambition.exercise.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/19:12
 * @Description:
 *
 * 1、声明银行账户类Account
 * （1）包含账号、余额属性，要求属性私有化，提供无参和有参构造，
 * （2）包含取款方法，当取款金额为负数时，抛出IllegalArgumentException，异常信息为“取款金
 * 额有误，不能为负数”，当取款金额超过余额时，抛出UnsupportedOperationException，异常信
 * 息为“取款金额不足，不支持当前取款操作”
 * （3）包含存款方法，当取款金额为负数时，抛出IllegalArgumentException，异常信息为“存款金
 * 额有误，不能为负数”
 * 2、编写测试类，创建账号对象，并调用取款和存款方法，并传入非法参数，测试发生对应的异
 * 常。
 */
public class Account {
    private int number;
    private double balance;

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }
    public Account() {
    }

    public void deposit(double money){
        if (money > -1){
            balance -= money;
        }else {
            throw new IllegalArgumentException("存款金额有误，不能为负数");
        }
    }


    //取款
    public void withdraw(double money){
        if (money >= 0){
            if (money <= balance){
                balance -= money;
            }else {
                throw new UnsupportedOperationException("取款金额不足，不支持当前取款操作");
            }
        }else {
            throw new IllegalArgumentException("取款金额有误，不能为负数");
        }
    }
}
