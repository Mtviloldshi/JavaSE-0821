package com.ambition.exercise.after4;

/*
    4、声明一个子类Manager经理，继承SalaryEmployee 增加属性：奖金，奖金比例 重写方法，public
    double earning()返回实发工资， 实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例) 重写
    方法，public String getInfo()：显示姓名和实发工资，月薪，工作日天数，请假天数，奖金比例
 */
public class Manager extends SalaryEmployee {
    private double bonusRatio;//奖金比例
    private double bonus;//奖金

    //返回实发工资，实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例) + 奖金
    public double earning() {
        return super.earning() * (1 + bonusRatio) + bonus;
    }

    public String getInfo() {
        return super.getInfo() + "\t奖金比例：" + bonusRatio * 100 + "\t%" + "\t奖金:" + bonus;
    }

    public Manager(int number, String name, MyDate myDate, double salary, int jobDays, int leaveDays, double bonusRatio, double bonus) {
        super(number, name, myDate, salary, jobDays, leaveDays);
        this.bonusRatio = bonusRatio;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
