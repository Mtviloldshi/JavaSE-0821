package com.ambition.exercise.homework7;

/**
 * @author 86176
 *
 * 架构师类属性：持有股票数量
 */
public class Architect extends Designer{
    /**
     * 股票数
     */
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect() {
    }

    public Architect(String position, int number, String name, int age, double salary, double bonus, int stock) {
        super(position, number, name, age, salary, bonus);
        this.stock = stock;
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + stock;
    }
}
