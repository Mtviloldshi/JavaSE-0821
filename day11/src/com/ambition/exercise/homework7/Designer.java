package com.ambition.exercise.homework7;

/**
 * @author 86176
 *
 *  设计师类属性：奖金
 */
public class Designer extends Programmer{
    /**
     * 奖金
     */
    private double bonus;

    public Designer(String position, int number, String name, int age, double salary, double bonus) {
        super(position, number, name, age, salary);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t" + bonus;
    }
}
