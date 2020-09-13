package com.ambition.demo.treemap2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: ambitions
 * @Date: 2020/09/13/10:45
 * @Description:
 */
public class Demo3 {
    public static void main(String[] args) {
        Map<Car,String> map = new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int i = o1.getNumber().compareTo(o2.getNumber());
                i = i == 0? o1.getBrand().compareTo(o2.getBrand()) : i;
                return i;
            }
        });
        Car car1 = new Car("京A88888", "法拉利");
        Car car2 = new Car("京A12314", "劳斯莱斯");
        Car car3 = new Car("京A27823", "奥迪");
        Car car4 = new Car("沪A28923", "五菱宏光");
        Car car5 = new Car("京A54823", "QQ奇瑞");
        map.put(car1,"北京");
        map.put(car2,"北京");
        map.put(car3,"北京");
        map.put(car4,"上海");
        map.put(car5,"北京");
        for (Car car : map.keySet()) {
            System.out.println(car.toString());
        }
    }
}
class Car {
    private String number;
    private String brand;

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String number, String brand) {
        this.number = number;
        this.brand = brand;
    }
}
