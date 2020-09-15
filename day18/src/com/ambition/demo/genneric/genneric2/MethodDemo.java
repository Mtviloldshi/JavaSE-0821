package com.ambition.demo.genneric.genneric2;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/10:30
 * @Description:
 */
public class MethodDemo {
    public static void main(String[] args) {
        User<Integer,String> user1 = new User<>("qwe",99);
        System.out.println(user1.getScore());
        User<Double,String> user2 = new User<>("qwe",99.0);
        System.out.println(user2.getScore());
        User<Double,Character> user3 = new User<>("qwe",99.0,'n');
        System.out.println(user3.getScore());
        User.show(123);
        User.show('1');
        User.show("123");
    }
}
class User<T,E>{
    private String name;
    private T score;
    private E gender;

    //泛型方法
    public static  <A> void show(A a){
        System.out.println(a);
    }

    public E getGender() {
        return gender;
    }

    public void setGender(E gender) {
        this.gender = gender;
    }

    public User(String name, T score, E gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public User(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }
}
