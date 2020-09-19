package com.ambition.exercise.ing2;

/**
 * @Author: ambitions
 * @Date: 2020/09/18/20:49
 * @Description:
 *
 *      1、要求两个线程，同时打印字母，每个线程都能连续打印3个字母。两个线程交替打印，一个线程打印
 *      字母的小写形式，一个线程打印字母的大写形式，但是字母是连续的。当字母循环到z之后，回到a。
 */
public class Demo2 {
    public static void main(String[] args) {
        printZiMu printZiMu = new printZiMu();
        printMin pm = new printMin(printZiMu);
        printBig pb = new printBig(printZiMu);

        new Thread(pm,"小写").start();
        new Thread(pb,"大写").start();
    }
}

//输出小写字母
class printMin implements Runnable{
    printZiMu printZiMu;

    public printMin(printZiMu printZiMu) {
        this.printZiMu = printZiMu;
    }

    @Override
    public void run() {
        while (true){
            printZiMu.print1();
        }
    }
}

//输出大写字母
class printBig implements Runnable{
    printZiMu printZiMu;

    public printBig(printZiMu printZiMu) {
        this.printZiMu = printZiMu;
    }

    @Override
    public void run() {
        while (true){
            printZiMu.print2();
        }
    }
}

//共享数据
class printZiMu{
    private static final int MAX = 3;
    private int num;

    public synchronized void print1() {
        if (num == 0){//等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println(Thread.currentThread().getName() +'a' + 1);
        if (num == 0){//当小写字母输出完的时候释放锁
            this.notify();
        }
    }

    public synchronized void print2(){
        if (num >= MAX){//等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            num++;
            System.out.println(Thread.currentThread().getName() + "b".toUpperCase().charAt(0) + 1);
            if (num == 3){//当大写字母输出完的时候释放锁
                this.notify();
            }
    }

}
