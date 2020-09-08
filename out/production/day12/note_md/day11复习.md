### 面向对象 - 抽象类

* 一、抽象类
    * 当继承关系中，父类的方法只有重写才有意义时，可以声明为抽象方法，具有抽象方法的类必须是抽象类。
    
    * 特点：
        * 抽象类不一定有抽象方法，有抽象方法的类一定是抽象类
        * 抽象类有构造方法，但是不能实例化抽象对象，供子类调用初始化父类数据的。
        * 抽象类的子类一定要实现抽象类的抽象方法，除非子类也是抽象类。
        
    * 使用格式：
        * abstract 关键字修饰的类就是抽象类，abstract修饰的方法就是抽象方法。    
        * public abstract class Animal{}
        
* 接口
    * 格式：
        interface关键字定义接口
        ```java
          public interface MyInterface{
              //成员包括；
               int A = 10;//静态常量 默认带修饰符 public static final
               void test();//抽象方法 默认带 public abstract   
               default void testDefault(){//默认方法拓展方法：为了拓展方法还能兼容当前接口
              } 
              static void testStatic(){//静态方法：用与提供一些此接口实现类的工功能
             //方法体
               }   
              private void testPrivate(){//私有方法：封装特点功能代码，供当前接口的默认方法和静态方法使用。
              }                                                                            
        }
          
        ```  
      
    * 理解：
        * 接口也是一些类共有特征的提取，但是Java类有单继承的限制，所以通过接口避免了单继承的局限性       
        
        * 接口是一种规范，是一种功能的拓展。
        
        * 特点：
            * 没有构造方法，不能创建对象
            * 接口中的抽象方法是用来被实现的，其实现类必须实现他的所有抽象方法，除非这个类是个抽象类。
        
        * 实现：
            * class Myclass implements MyInterface{重写方法}    
            * MyInterface inter = new Myclass();
            
        * 经典接口：
            * Comparable     compareTo(Object o);        //用于比较两个对象，定义在要比较的类中。
            * Comparator     compare(Object o, Object o1)//用于比较两个对象，定义在比较类的外部。
            * Cloneable      标记接口：没有成员方法的接口
            
        