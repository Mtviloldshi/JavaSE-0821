package review.test01.ing3;

/**
 * @Author: ambitions
 * @Date: 2020/09/16/14:23
 * @Description:
 *
 * 、编写一个懒汉式 单例设计模式
 */
public class Demo2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton{
    //私有化 初始化对象
    private static Singleton singleton = null;

    //私有化构造方法
    private Singleton(){

    }

    //创建对象
    public static Singleton getInstance(){
        if (singleton == null){
            return singleton = new Singleton();
        }else {
            return singleton;
        }
    }
}
