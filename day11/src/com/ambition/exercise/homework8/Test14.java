package com.ambition.exercise.homework8;

public class Test14 {
    public static void main(String[] args) {
        Father3 f = new Father3();
        Son3 s = new Son3();
        System.out.println(f.getInfo());//"atguigu"
        System.out.println(s.getInfo());//"尚硅谷"
        s.test();//"尚硅谷" "atguigu"
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//"atguigu"
        System.out.println(s.getInfo());//"大硅谷"
        s.test();//"大硅谷" "atguigu"
    }
}

class Father3 {
    private String info = "atguigu";

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

class Son3 extends Father3 {
    private String info = "尚硅谷";

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String getInfo() {
        return info;
    }

    public void test() {
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
