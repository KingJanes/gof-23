package com.stu.collection;

import java.util.Collection;
import java.util.Iterator;

//  使用迭代器 取出 集合的元素
public class IteratorDemo {
    public static void iteratorDemo(Collection coll){
        //   向集合内添加元素
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        /*  itreator函数返回一个 Iterator 对象
        *   Iteratot.hasNext 函数判断是否有下一个元素
        *   Iterator.Next 取出当前指针 元素
        *   使用while 循环当集合元素取完时 iteration 对象还纯在 但是后续不能再取出元素 这样会造成内存浪费
        *       如果后续还要继续使用Iterator  那么就可以 使用这种方式
        *
        *   可以使用for 循环取出集合元素  取完元素时 自动释放对象
        * */
        Iterator it = coll.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }

        //  取出集合元素的第2 中方法 使用for 循环
        for(Iterator it1 = coll.iterator(); it.hasNext(); ){
            System.out.println(it1.next());
        }
    }



}
