package com.ambition.exercise.after3;

/*
    4、声明一个子类Manager经理，继承SalaryEmployee，增加属性：奖金比例 重写方法，
    public double earning()返回实发工资，实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例)
 */
public class Manager extends SalaryEmployee {
    private double bonusRatio;//奖金比例

    //返回实发工资，实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例)
    public double earning() {
        return super.earning() * (1 + bonusRatio);
    }

    //new Manager("总经理", 8000, 20, 1, 1000)
    public Manager(String name, double salary, int jobDays, int leaveDays, double bonusRatio) {
        super(name, salary, jobDays, leaveDays);
        this.bonusRatio = bonusRatio;
    }

    public Manager() {
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
