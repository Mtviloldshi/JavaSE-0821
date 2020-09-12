### 常用类及其API-下

#### 一、日期类

* Date类：大部分方法已经过期，不推荐使用

* Calendar: 
    * getInstance();获取Calendar对象
    * 通过get(常量)，获取准确时间
    
* SimpleDateFormat:日期格式化类：
    * 格式化：日期转字符串 SimpleDateFormat("yyyy-MM-dd HH:mm:ss E).new Date();
    * 解析：字符串转日期 格式化对象.parse(日期字符串);    

* JDK8的 日期类
    * LocalDate 日期类
    * LocalTime
    * LocalDateTime 日期时间类
    * now() 获取当前系统时间    
    * of() 指定日期时间获得日期对象
    
    * 当前时间基础上的增加与减少时间
    * 设定时区，ZoneDateTime时区类
    * 计算时间差

* DateTimeFormatter日期格式化：
* 解析 格式化日期对象.parse(字符串日期)  

#### 系统相关类

* System类：
    * currentTimeMillis():返回系统距离1970 0.0.0 总毫秒数
    * exit() :退出当前系统
    * gc():垃圾回收

* Runtime类
    * 单例
    
#### 包装类

* Java针对基本数据类型 提供了对应的包装类，为其提供了丰富的API功能

* 自动-->装箱/拆箱   

* 缓存问题 针对整形中，[-128,127]范围内的的整数，java在方法区提供了缓存，类String存储，

#### 枚举Enum

* 程序中只用到固定的几个值时，使用枚举比较方便。
    * ``
     public enum gender{
        FEMALE,MALE。
     }   
    ``
    * 常和switch使用。
    * switch支持类型：byte short int char String 枚举
    * 常用方法：
        * name():获取对象名
        * ordinal()://对象序号
        * valueOf("MALE""):根据字符串获取对象
        * values()：返回所有常量对象
                  