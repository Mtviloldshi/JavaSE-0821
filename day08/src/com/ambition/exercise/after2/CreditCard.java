package com.ambition.exercise.after2;

/*
    （2）声明一个银行信用卡类，继承储蓄卡类
        增加属性：可透支额度，最多可透支金额
        重写存款 public void withdraw(double money)，可透支
        存款 pubic void save(double money)，需要恢复可透支额度
 */
public class CreditCard extends Bank {
    private int overdraftAmount;//透支金额
    public CreditCard(int count, double balance, int overdraftAmount) {
        super(count, balance);
        this.overdraftAmount = overdraftAmount;
    }

    //重写取款方法
    public void withdraw(double money) {
        if (money > super.getBalance() + overdraftAmount) {//如果取款金额超过了余额加上透支金额
            super.setBalance(-(super.getBalance() + overdraftAmount));//就把余额设置为-余额-透支金额
        } else if (money < 1) {
            System.out.println("输入金额有误！");
        } else {
            //设置余额
            super.setBalance(super.getBalance() - money);
        }
    }

    //存款
    public void save(double money) {
        if (money > 1) {
            super.setBalance(super.getBalance() + money);
        } else {
            System.out.println("输入金额有误！");
        }
    }

    public String getInfo() {
        //如果余额小于0
        if (super.getBalance() < 0) {
            //并且小于，小于（-余额-透支金额）
            if (super.getBalance() < (super.getBalance() - overdraftAmount)) {
                //打印超出透支信息
                return "账户：" + super.getCount() + "\t已超出透支金额";
            }
            //打印透支金额
            return "账户：" + super.getCount() + "\t已透支：" + (-super.getBalance());
        } else
            //打印账户余额
            return "账户：" + super.getCount() + "\t余额：" + super.getBalance();
    }

}
