package com.ambition.exercise.inclass;

/**
 * @author 86176
 *  声明一个身体Body类，包含一个私有的boolean类型的属性live，初始化为true，表示活着。属性
 * 私有化，提供get/set方法。
 * 声明一个身体Body的内部类Heart，包含void beat()方法，当live为true时，打印“心脏在跳动”，
 * 否则打印“心脏停止跳动"。因为Heart只为外部类Body服务，而又具有自己的方法，属性等，而且
 * 这里应该是有Body实体存在的情况下才能有Heart实体，所以这里把Heart声明为非静态内部类。
 * 声明一个测试类，在测试类的主方法中，创建身体和心脏的对象，调用心脏对象的beat()方法，然
 * 后调用身体对象的setLive()方法，设置为false后，再调用心脏对象的beat()方法查看结果
 */

class BodyTest{
    public static void main(String[] args) {
        Body body = new Body();
        Body.Heart heart = body.new Heart();
        heart.beat();
        body.setLive(false);
        heart.beat();
    }
}
/**
 * @author 86176
 */
public class Body {
    private boolean live = true;

    class Heart{
        public void beat(){
            if (live){
                System.out.println("心脏在跳动");
            }else {
                System.out.println("心脏停止跳动");
            }
        }

    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}


