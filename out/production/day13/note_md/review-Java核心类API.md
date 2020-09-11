## 常用核心类及API

### 字符串String

* 字符串的特点 ：Java字符串的一个重要特点就是字符串不可变。
    * 这种不可变性是通过内部的private final char[] 字段，以及没有任何修改char[] 的方法实
      现的。修改一个字符串变量值，相当于新生成一个字符串对象。
      
    * 上面这个字符数组 private final char value[]; 也是字符串对象的内部存储形式。
        * 所以"abc" 等效于 char[] data={ 'a' , 'b' , 'c' } 。
        
    * 字符串字面量也是一个String类的实例，存储在字符串常量池中，相同的字符串字面量表示的对象
      在内存中只有一份。
      
    * 字符串String类型本身是final声明的，意味着我们不能继承String，也就意味着我们不能去重写他
      的方法  
      
    * 字符串的创建：
        * 1 构造器创建
        * 2 通过+号创建，任意数据类型与"字符串"进行拼接，结果都是字符串
        
* 字符串内存图
    * [字符串内存图](/images/字符串内存图-自画.png)    
    
    * intern() : 无论这是个什么类型的数据都把他丢到字符串常量池中，
        如果常量池中已存在，则返回常量池中已存在的字符串，如果常量池中不存在，
        则把这个字符串新添加在这个字符串中，然后返回  
        
    * 结论：
        * 常量+常量：结果是常量池
        * 常量与变量 或 变量与变量：结果是堆
        * intern方法有jvm版本的区别，这里不再深入分析，jdk8中执行原理是如果字符串常量池有内容相
            同的字符串则直接返回，否则把堆中创建的字符串引用放入字符串常量池，返回此引用，总之所有
            版本都是通过字符串常量池返回的内容  
            
                       
### StringBuilder&StringBuffer

* 与String的区别
    * 因为String对象是不可变对象，虽然可以共享常量对象，但是对于频繁字符串的修改和拼接操作，效率
      极低。因此，JDK又在java.lang包提供了可变字符序列StringBuilder和StringBuffer类型。
      
* StringBuffer：老的，线程安全的（因为它的方法有synchronized修饰）
* StringBuilder：线程不安全的  
* StringBuffer && StringBuilder   常用API：略
* StringBuffer && StringBuilder 比String的效率更高

### 数学类

* Math类
* java.lang.Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类
  似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。
  似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。
  
* Random 类 
    * 包含大量创建随机数的API
    
* BigInteger
    * 不可变的任意精度的整数 
    
* BigDecimal
    * 不可变的、任意精度的有符号十进制数。
    
### 日期时间API

* java.util.Date    
    * new Date()：当前系统时间
    * long getTime()：返回该日期时间对象距离1970-1-1 0.0.0 0毫秒之间的毫秒值
    * new Date(long 毫秒)：把该毫秒值换算成日期时间对象
    
* java.util.Calendar
    > Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR 、MONTH 、DAY_OF_MONTH 、HOUR 等
      日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
      瞬间可用毫秒值来表示，它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00.000，格里高
      利历）的偏移量。与其他语言环境敏感类一样， Calendar 提供了一个类方法 getInstance ，以获得
      此类型的一个通用的对象。    
    * getInstance() 获得Calendar对象
    * get(常量) 

* java.text.SimpleDateFormat    
    * SimpleDateFormat用于日期时间的格式化。 
    * SimpleDateFormat sm = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒 E");
    * sm.format(date)                 