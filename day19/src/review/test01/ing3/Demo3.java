package review.test01.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/14:29
 * @Description:
 *
 *      编写饿汉式单例设计模式
 */
public class Demo3 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton1{
    //创建私有化静态对象变量
    private static final Singleton1 singleton1 = new Singleton1();

    //私有化构造方法
    private Singleton1(){

    }

    //给出获取对象方法
    public static Singleton1 getInstance(){
        return singleton1;
    }

}
