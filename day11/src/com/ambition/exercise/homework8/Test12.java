package com.ambition.exercise.homework8;

public class Test12 {
    public static void main(String[] args) {
        Father2 f = new Father2();
        Son2 s = new Son2();
        System.out.println(f.getInfo());//"atguigu"
        System.out.println(s.getInfo());//"atguigu"
        f.setInfo("尚硅谷");
        System.out.println(f.getInfo());//"尚硅谷"
        System.out.println(s.getInfo());//"尚硅谷"
    }
}

class Father2 {
    private String info = "atguigu";

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

class Son2 extends Father2 {

}
