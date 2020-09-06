package com.ambition.exercise.homework8;

public class Test13 {
    public static void main(String[] args) {
        Father5 f = new Father5();
        Son5 s = new Son5();
        System.out.println(f.getInfo());//"atguigu"
        System.out.println(s.getInfo());//"尚硅谷"
        s.test();//"尚硅谷" "atguigu"
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//"atguigu"
        System.out.println(s.getInfo());//"大硅谷"
        s.test();//"大硅谷" "大硅谷"
    }
}
class Father5{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son5 extends Father5{
    private String info = "尚硅谷";
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());//指自身加载父类
    }
}
