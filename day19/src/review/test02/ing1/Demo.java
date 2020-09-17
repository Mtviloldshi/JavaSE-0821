package review.test02.ing1;


/**
 * @Author: ambitions
 * @Date: 2020/09/16/18:20
 * @Description:
 *      写一个线程输出1-100的数
 */
public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread th = new Thread(myThread);
        th.start();
    }
}
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }
}
