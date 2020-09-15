package com.ambition.demo.genneric.genneric2;

/**
 * @Author: ambitions
 * @Date: 2020/09/14/10:09
 * @Description:
 * 泛型接口
 */
public interface Genneric<T> {
     void show(T t);//省略public abstract
}
class Test{
    public static void main(String[] args) {
        new Genneric<String>() {
            @Override
            public void show(String o) {
                System.out.println(o);
            }
        }.show("123");
    }
}