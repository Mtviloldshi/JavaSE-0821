### 集合（完结）

#### Map集合

* 存储一组键值对的一个容器

* 特点：key是唯一的，value是可以重复的，元素无序
* 常用API：
    * put(key,value);//添加元素
    * remove();//删除元素
    * get(key);//根据key获取value
    * size();//集合中元素的个数
    * ketSet();//获取所有的key并封装到一个set集合中
    * values();//获取所有的value并封装到一个Collection集合中
    * entrySet()//获取每一个键值对，把它们看成一个整体，封装刀Set集合

* HashMap实现类
    * 特点：
        * key唯一，无序，key和value都可以为null
        * 底层结构：
            * hash表=数组+链表+红黑树
        * 添加元素的原理：
            * 首次添加元素需要扩容，容量为16
            * 每次添加元素，计算key的hash值，寻找数组中的索引位置，判断此位置是否有元素 
            没有直接插入，如果有则通过比较equals判断是否重复，是则直接覆盖，否则再判断
            是树则进行树操作，如果是链表则遍历链表，判断是否重复的key，重复则覆盖value，
            否则直接尾部插入,插入了新元素判断是否需要转为红黑树或是需要扩容，当链表长度达8，
            并且数组长度大于64时，链表转为红黑树，未达到64则进行扩容操作,扩容两倍。
            > 扩容操作，因要重新计算hash，重新分布元素，所以是很消耗性能的操作  
        
            * 构造：
            * new hashMap()//未初始化容量
            * new hashMap(int initialCapacity)
            
* LinkedHashMap
    * 特点：key唯一，有序的，通过一个双向链表保证了元素的插入顺序。          
    
* TreeMap
    * 特点: key唯一，无序的，实现排序，元素必须可以比较大小,实现（Comparable，Comparator）    
    * 底层结构：红黑树
    
#### Collection工具类

#### 总结    

* 1.什么是集合？
* 2.有数组为什么还要用集合？
* 3.为什么提供这么多集合？
* 4.这些集合都有什么特点？
    Collection:
        List:
            ArrayList:
            LinkedList:
            Vector:
                Stack:
        Set:
            HashSet:
            LinkedHashSet:
            TreeSet
    Map:    
        HashMap:
            LinkedHashMap:
        TreeMap:
        HashTable:
* 5.为什么会有这些特特点？
* 6.常用API以及遍历操作