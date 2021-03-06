### 泛型

#### 一、相关概念

* 并发与并行
    * 并行：同一时刻，两件事同时发生
    * 并发：同一微小时间段内，同时发生多件事，这是我们主要研究对象
    
* 进程与线程
    * 进程：系统为每个程序以进程为单位分配独立的系统资源。进程就是一个程序运行的过程的描述。
    * 线程：每个进程中一个最小执行单元，每个线程至少有一个线程，如果有多个线程，这个程序就是多线程。
    * 举例  JVM的运行是多线程的，JVM启动时至少有一个main线程，还有一个垃圾回收线程是守护线程（后台线程）  
    
* 多线程的优点：
    * 提升CPU的利用率，提升程序的响应速度。    
    
* 多线程的创建方式
    1.* 继承Thread类：
        * 创建一个Thread类的子类，并重写run方法
        * 使用：创建子类对象
        * 调用start()方法
    2.* 实现Runnable接口： 
        * 创建一个Runnable实现类（线程任务），重写run方法
        * 创建一个线程任务类对象
        * 创建一份Thread类对象，并通过构造器传入一个线程任务类对象
        * 调用start()方法   
        
    * 两种方式的比较
        * 第一种方式使用简单，但是有单继承限制
        * 第二种方式使用步骤稍微复杂一些，避免了单继承的限制，方便共享数据    
        
* Thread类API
    * sleep(long time)//睡眠   
    * ...
    
* 线程生命周期
    * 新建 --》 就绪 --》 运行 --》 死亡
    * 新建 --》 就绪 --》 阻塞 --》 运行 --》 死亡
    * 新建 --》 就绪 --》 运行 --》 阻塞 --》 就绪 --》 运行 --》 死亡         
    
* 线程安全问题
    * 多线程
    * 有共享数据    
    * 多条语句操作共享数据
        * 解决
            * 把多条操作共享数据的语句，封装成一个整体。
            * 使用synchronized关键字，可实现此功能
            * 方式一：synchronized(同步锁){操作共享数据的多条代码语句}
            * 方式二：public synchronized void method(){可能会产生线程安全问题的代码}
            
* 线程间的通信
     >多个线程共同完成一个任务，每个线程的任务不同，而且每一个线程人物的执行需要根据另外一个线程的结果来决定是否执行。
           >这就需要一个线程把结果通知给另外一个线程。要实现这种线程通信，通常使用等待唤醒机制wait notify
           >以上描述的例子就是经典的生产者消费者案例
       
* 死锁
    * 同步代码块使用不当，有可能出现一个线程需要使用的锁被另外一个线程使用并且未释放，反过来也是此情况，很可能出现死锁       
    * 双方拿着对方的锁不是放
                