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
    * sm.format(格式化日期对象);
    * sm.parse(字符串对象)   
    
### JDK8后日期类

* JDK8之前日期类的缺点：
    * 可变性：象日期和时间这样的类对象应该是不可变的。Calendar类中可以使用三种方法更改日历字段：set()、add() 和 roll()。
    * 偏移性：Date中的年份是从1900开始的，而月份都是从0开始的。
    * 格式化：格式化只对Date有用，Calendar则不行。
    * 此外，它们也不是线程安全的等。 

* LocalDate、LocalTime、LocalDateTime 
    * LocalDate 包含年 月 日 
    * LocalTime：包括 时-分-秒-纳秒
    * LocalDateTime：包括 年 月 日 时-分-秒-纳秒 星期数    
    * 三个时间类都是java.time包下，并且提供了大量时间API
    
* 指定时区日期时间：ZonedDateTime  
    * Asia/Shanghai 上海时间
    * UTC 格林威治时间
    * America/New_York 纽约时间
    * 没写就系统默认当前地区时间
    
* 持续日期/时间：Period和Duration
    * Period :用于计算两个”日期“的时间间隔
    * Duration : 用于计算两个“时间”的时间间隔  
    
* DateTimeFormatter ：日期时间格式化        

* 该类提供了三种格式化方法：
    * 预定义的标准格式。如：ISO_DATE_TIME;ISO_DATE
    * 本地化相关的格式。如：ofLocalizedDate(FormatStyle.MEDIUM)
    * 自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)  
    
### 系统相关类

* java.lang.System类
    * static long currentTimeMillis() ：返回当前系统时间距离1970-1-1 0:0:0的毫秒值
    * static void exit(int status) ：退出当前系统
    * static void gc() ：运行垃圾回收器。
    * static String getProperty(String key)：获取某个系统属性 
    
* java.lang.Runtime类      
    * public static Runtime getRuntime()： 返回与当前 Java 应用程序相关的运行时对象。 
    * public long totalMemory()：返回 Java 虚拟机中的内存总量。此方法返回的值可能随时间的推移而变
      化，这取决于主机环境。
    * public long freeMemory()：回 Java 虚拟机中的空闲内存量。调用 gc 方法可能导致 freeMemory 返回
      值的增加。
    * Process exec(String command):在单独的进程中执行指定的字符串命令
    
### 数组工具类Arrays

* java.util.Arrays数组工具类，提供了很多静态方法来对数组进行操作，而且如下每一个方法都有各种重
  载形式
  
### 包装类

* Java提供了两大类数据类型，基本类型与引用类型，使用基本类型在于效率，但是缺少像引用数据类型
  一样的丰富API，那么Java提供了针对基本数据类型的保证类，以提供更加便捷的操作功能，包装类就
  是把基本数据类型包装成对应的引用数据类型

    * byte Byte
    * short Short
    * int Integer
    * long Long
    * float Float
    * double Double
    * char Character
    * boolean Boolean
    * void Void          

* 装箱与拆箱
    * 装箱：把基本数据类型转为包装类对象。
        * 转为包装类的对象，是为了使用专门为对象设计的API和特性
    * 拆箱：把包装类对象拆为基本数据类型。
        * 转为基本数据类型，一般是因为需要运算，Java中的大多数运算符是为基本数据类型设计的。比较、算术等   
        
* 总结：对象（引用数据类型）能用的运算符有哪些？
    * （1）instanceof
    * （2）=：赋值运算符
    * （3）==和!=：用于比较地址，但是要求左右两边对象的类型一致或者是有父子类继承关系。
    * （4）对于字符串这一种特殊的对象，支持“+”，表示拼接。               
    
### 枚举

* 概述：
    * 某些类型的对象是有限的几个    
    
* 枚举类型本质上也是一种类，只不过是这个类的对象是固定的几个，而不能随意让用户创建。
    * 在JDK1.5之前，需要程序员自己通过特殊的方式来定义枚举类型。
    * 在JDK1.5之后，Java支持enum关键字来快速的定义枚举类型。
    
* 枚举类的创建
    * 在JDK1.5之前声明枚举    
        * 构造器加private私有化
        * 本类内部创建一组常量对象，并添加public static修饰符，对外暴露这些常量对象 
    
    * 在JDK1.5之前声明枚举  
    * **修饰符 enum  类名{常量对象列表}**
    * **修饰符 enum  类名{常量对象列表 其他成员列表列表}**
    
* 枚举类的要求和特点：
    * 枚举类的常量对象列表必须在枚举类的首行，因为是常量，所以建议大写。
    * 如果常量对象列表后面没有其他代码，那么“；”可以省略，否则不可以省略“；”。
    * 编译器给枚举类默认提供的是private的无参构造，如果枚举类需要的是无参构造，就不需要声
    明，写常量对象列表时也不用加参数，
    * 如果枚举类需要的是有参构造，需要手动定义private的有参构造，调用有参构造的方法就是在常
    量对象名后面加(实参列表)就可以。
    * 枚举类默认继承的是java.lang.Enum类，因此不能再继承其他的类型。
    * JDK1.5之后switch，提供支持枚举类型，case后面可以写枚举常量名。
    * 枚举类型如有其它属性，建议（不是必须）这些属性也声明为final的，因为常量对象在逻辑意义
    上应该不可变。 
    
* 枚举类型常用方法
    * 1.toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！
    * 2.name():返回的是常量名（对象名） 【很少使用】
    * 3.ordinal():返回常量的次序号，默认从0开始
    * 4.values():返回该枚举类的所有的常量对象，返回类型是当前枚举的数组类型，是一个静态方法
    * 5.valueOf(String name)：根据枚举常量对象名称获取枚举对象
           