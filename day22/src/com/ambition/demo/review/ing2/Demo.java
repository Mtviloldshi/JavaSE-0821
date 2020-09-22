package com.ambition.demo.review.ing2;

import java.security.PublicKey;

/**
 * @Author: ambitions
 * @Date: 2020/09/20/12:25
 * @Description:
 *  示例代码：友谊赛
 * 案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
 * 兔子的速度是10米每秒，兔子每跑完10米休眠的时间10秒
 * 乌龟的速度是1米每秒，乌龟每跑完10米的休眠时间是1秒
 * 要求：要等兔子和乌龟的线程结束，主线程（裁判）才能公布最后的结果。
 */
public class Demo {
}
class Racer extends Thread{
    private String name;//运动员名字
    private long runTime;//每米需要时间，单位毫秒
    private long resultTime;//每10米需要休息的时间，单位毫秒
    private long distance;//全程距离，单位米
    private long totalTime;//跑完需要的总时间

    public Racer(String name, long runTime, long resultTime, long distance, long totalTime) {
        this.name = name;
        this.runTime = runTime;
        this.resultTime = resultTime;
        this.distance = distance;
    }

    @Override
    public void run() {
        long sum = 0;
        long start = System.currentTimeMillis();
        while (sum < distance){
            System.out.println(name + "正在跑。。。");
            try {
                Thread.sleep(runTime);
            } catch (InterruptedException e) {
                return;
            }
            sum++;
            try {
                if (sum % 10 == 0 && sum < distance){
                    //每十米休息一下
                    System.out.println(name + "已经跑了" + sum + "米正在休息。。。。");
                    Thread.sleep(resultTime);
                }
            }catch (InterruptedException e){
                return;
            }
        }
        long end = System.currentTimeMillis();
        totalTime = end - start;
        System.out.println(name + "跑了" + sum + "米，已经到达终点，共用时" + totalTime/1000.0 + "秒");

    }
    public long getTotalTime(){
        return totalTime;
    }
}
