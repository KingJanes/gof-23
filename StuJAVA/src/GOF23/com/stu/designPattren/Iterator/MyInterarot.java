package GOF23.com.stu.designPattren.Iterator;
/**
 * 定义基本函数  具体有数据聚合对象类部类实现
 * */
public interface MyInterarot {
    // 获取当前元素
    Object get();
    // 将游标重置为0
    void first();
    // 获取元素的索引  游标cursor
    int of (Object obj);
    // 获取元素个数
    int size();
    // 判断是否有下一个元素
    boolean hasNext();
    //指向下一个元素
    void next ();
    // 判断是否是一个元素
    boolean isFirst();
    // 判断是否是最后一个元素
    boolean isLast();
}
