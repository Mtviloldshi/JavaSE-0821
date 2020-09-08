package com.ambition.exercise.ing2;

import java.time.chrono.HijrahEra;

/**
 * @Author: ambitions
 * @Date: 2020/09/07/20:17
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        //获取外部类
        Person person = new Person();

        //获取内部类
        BodyOptionII heart = person.getHeart();

        //调用内部类方法
        heart.beat();
        //调用外部类修改方法方法
        person.setLive(false);

        heart.beat();
    }
}
interface BodyOptionII{//可跳动的
    public abstract void beat();
}
class Person {
    private  boolean live = true;
    private  Heart heart = new Heart();
    private class Heart implements BodyOptionII{
        @Override
        public void beat() {
            // 直接访问外部类成员
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }

    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public BodyOptionII getHeart(){
        return heart;
    }
}
