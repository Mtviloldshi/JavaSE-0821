package com.ambition.exercise.homework1;

/**
 * @author 86176
 * <p>
 * 创建Account类的一个子类CheckAccount代表可透支的账户，
 * 该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法
 */
public class CheckAccount extends Account {
    /**
     * overdraft：可限制额度
     */
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        //合法金额
        if (amount > 0){
            //取款金额小于等于 余额 + 可透支金额
            if (amount <= getBalance() + overdraft){
                //取款金额小于等于余额
                if (amount <= getBalance()){
                    //余额 = 余额 - 取款金额
                    setBalance(getBalance() - amount);
                    System.out.println("取款成功！");
                    System.out.println("您的余额为：" + getBalance());
                    System.out.println("您的可透支金额为：" + overdraft);
                }else {
                    //因为取款金额小于等于 余额 + 可透支金额
                    //所以可透支金额永远不为负数 故不必再做判断
                    //可透支金额 = 可透支金额 - (取款金额 - 余额)
                    overdraft -= amount - getBalance();
                    //当取款金额大于 余额 ，余额取款之后设置为0
                    setBalance(0);
                    System.out.println("取款成功");
                    System.out.println("您的余额为：" + getBalance());
                    System.out.println("您的可透支金额为：" + overdraft);
                }
            }else {
                System.out.println("超出可透支金额！");
                System.out.println("您的余额为：" + getBalance());
                System.out.println("您的可透支金额为：" + overdraft);
            }
        }else {
            System.out.println("请输入合法金额！");
        }
    }

//    @Override
//    public void withdraw(double amount) {
//        //初始化金额
//        double money = 0;
//        if (amount > 0) {
//            //小于等于 余额+透支金额
//            if (amount <= getBalance() + overdraft) {
//                //如果去的钱大于余额
//                if (amount >= getBalance()) {
//                    //超出余额的钱
//                    money = amount - getBalance();
//                    //透支金额=透支金额-超出的余额金额
//                    overdraft -= money;
//                    //把余额设置为0
//                    setBalance(0);
//                    System.out.println("取款成功");
//                    System.out.println("您的余额为：" + getBalance());
//                    System.out.println("您可透支金额为：" + overdraft);
//                } else {
//                    //设置余额
//                    setBalance(getBalance() - amount);
//                    System.out.println("取款成功\n您的余额为：" + getBalance() + "\n您的可透支金额为：" + overdraft);
//                }
//            } else {
//                //余额小于可透支金额
//                if (getBalance() < overdraft || getBalance() < amount) {
//                    System.out.println("超出透支金额！");
//                } else {
//                    System.out.println("取款失败");
//                }
//                System.out.println("您的余额为：" + getBalance() + "\n您可透支金额为：" + overdraft);
//            }
//        } else {
//            System.out.println("请输入合法数字！");
//        }
//    }
}