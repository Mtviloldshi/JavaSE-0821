### 集合

#### LinkedList实现类

* 底层实现：双向链表，增删快，查找慢
    * 特有方法： 头尾操作方法
    * 队列：
        * offer()入队    
        * poll()出队
    * 栈：
        * push()压栈
        * pop()弹栈 
    * Stack实现类，Vector的子类，底层结构是数组
    
    * Vector区别ArrayList:底层都是数组，前者线程安全，且有Stack子类，并且效率低       
    
* ListIterator:仅用于List集合的迭代器，是Iterator子接口，提供了更多方法    

#### Set集合

* 特点元素唯一，大部分是无序的

* 实现类：
    * HashSet:
        * 底层结构 hash表
    * LinkedHashSet:通过一个链表，保证了元素的有序
        * 底层结构 hash表 + 链表
    * TreeSet
        * 特点：实现了排序，同排序接口(Comparable,Comparator)
        * 底层结构 红黑树
        
    * 常用方法  
    