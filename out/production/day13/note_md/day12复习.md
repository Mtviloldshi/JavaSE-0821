### 内部类 - 异常 

#### 一、设计模式：前人在开发过程中一些经验总结，23种。

* 单例模式 ：让程序在运行期间只有保留一个类的实例时，应该如何做到？

    * 懒汉式：第一次使用时加载对象
    ```java
            public class Singleton{
              //初始化静态对象
              private static Singleton singleton = null;
              //属性私有化
              private Singleton(){}
              //创建静态方法,是否有对象，没有就新创建，返回对象
              public static Singleton getInstance(){
                     if (singleton == null){
                           singleton = new Singleton();                      
                  }
                      return singleton;
              }
          }
     ```
    * 饿汉式：类加载时就是创建对象
       ```java
        public class Singleton{
          //私有初始化静态对象
          private static Singleton singleton = new  Singleton();
          //属性私有化
          private Singleton(){}
          //创建静态方法,返回对象
          public static Singleton getInstance(){
                  return singleton;
          }
      }
       ```
      
#### 二、static  
    
* 静态是随着类的加载而加载，类的实例一般都是在类加载后才能创建，所以静态不能访问非静态，反之可以

* static可以修饰：
    * 修饰的类：只能修饰内部类
    * 成员变量：类变量，静态变量，内存中子类的所有对象共享的一份数据   
    * 成员方法：类方法，静态方法，可以直接通过类名调用，不能访问非静态方法和非静态成员
    * 静态代码块：随着类的加载而加载，初始化静态变量
    
#### 三、内部类

* 定义在类内部的类

* 内部分类：
    * 成员内部类：
        * 静态内部类：可以看作一个独立的类，只不过使用时需要加上外部类的标记
        
        * 非静态内部类：
            * 主要为外部类所用，在内部类当中可以直接使用外部类的成员
            * 内部类不能创建静态成员，除非是静态常量，或者是从父类继承的静态属性和方法。
            * 访问格式：1.创建外部类对象 通过外部类对象创建内部类对象
            
    * 局部内部类  
        * 定义在外部类的方法中  
            * 在方法中使用内部类的对象访问局部变量时，变量默认带final。
            
    * 匿名内部类：一般只使用一次类时，使用匿名内部类。         
        * new 类或抽象类或接口(){重写方法};//表示创建了一个类的子类对象或者接口的实现类对象。
        
#### 四、注解        

* 是给程序看的一种注释，或者说是一种标记。可以使用在方法上，类上，属性上。
    * 例如：
        * @Override     ：重写方法
        * @Deprecated ：表示已过时，不推荐使用
        * @SuppressWarnings :抑制警告
        
* 自定义注解：使用关键字 @interface
* 元注解 ： 给注解使用的注解


#### 五、异常        

* 概念：程序运行中，出现的非正常情况。

* 异常系统：
    * Throwable :
        * Error: 表示严重的错误，我们一般无法处理，只能优化代码，stackOverFlowError\OutOfMemoryError
        * Exception: 这是我们通常所说的异常
            * 非受检异常：RuntimeException及其子类都是非受检异常，可以不处理，非必须处理异常
            * 受检异常：除非受检异常外的，如果有此类异常抛出，必须处理，否则无法运行
            
* 异常的生成和抛出机制：
    * 虚拟机的自动抛出：
        * 当发生异常时，程序会创建对应的异常对象，并自动抛出，如果没有处理，打印异常信息，jvm终止            
        
    * 手动抛出：
        * 手动创建异常对象，并通过关键字throw抛出。
        * throw new 异常类型("异常信息"); 
        
* 异常的处理机制：为了使程序在发送异常时还能继续正常运行，所以需要对象可能发生的异常处理
    * 方式一：try{可能发生异常的代码}catch (异常类型 异常对象){处理异常的代码}finally{不管程序出不出异常都会执行的代码}
    
    * 方式二：throws关键字用在方法上，表示此方法可能有异常发生,谁调用谁处理 public void test() throws Exception{}
    
* 自定义异常：
    * java不可能给我们提供所有的异常情况，所以在实际开发中，根据需要会设计自定义的异常体系。
    
    * 一般先设计一个”根“ 异常，一定要继承一个现有的异常（通常建议RuntimeException）然后再派生出各种异常
        * class UserException extends RuntimeException{}
        * class UserExistException extends UserException{}
        * class UserNullException extend UserExistException{构造器，异常方法}
           
        