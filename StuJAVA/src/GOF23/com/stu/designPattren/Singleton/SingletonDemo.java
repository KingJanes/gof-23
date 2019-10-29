package GOF23.com.stu.designPattren.Singleton;
/**
 *  单例设计模式
 *
 *  饿汉式单例设计模式
 *      特点  线程安全 调用效率高（就是值获取单例对象） 但是不能不能延迟加载
 * */

public class SingletonDemo {

    private static SingletonDemo singleton = new SingletonDemo();

    private SingletonDemo() {};

     public static SingletonDemo getIntstance() {
         return singleton;
     }
}

/**
 *
 *  懒汉式加载
 *      特点  线程安全 调用效率低 可以延迟加载 真正用的时候才创建
 *      问题  每次获取单例对象都要同步并发效率低
 * */
class SingletonDemo01 {

    private static SingletonDemo01 singleton = null;

    private SingletonDemo01() {};

    public static synchronized SingletonDemo01 getIntstance() {
        if (singleton == null) {
            return singleton = new SingletonDemo01();
        }
        return singleton;
    }
}


/**
 *     静态内部类方式 （也是一种懒加载方式）
 *
 *   这种方式 线程安全调用效率高 并且实现了懒加载
 *     要点： 外部类没有static 属性 不会像饿汉式哪样立即加载
 *      只有真正调用获取单例对象时才会加载静态内部类 加载类时线程是安全的单例对象是static fainl类型
 *      保证了内存中只有这样一个shi例存在 而且只能赋值一次 从而保证了线程的安全性
 *       兼备了并发高效调用和延迟加载的优势
 *
 */
class SingletonDemo2{

    private SingletonDemo2() {}

    public static SingletonDemo2 getInstance() {
        return  SingletonClassInstance.instance;
    }
    private static class SingletonClassInstance{
        private static final SingletonDemo2 instance = new SingletonDemo2();
    }
}

/**
 *
 * 双重检测模式
 *    这种模式将同步内容放到了if内部 提高了执行的效率不必每次获取单例对象都要进行同步
 *       只有第一次执行才同步创建对象后就没必要同步了
 *
 * 问题：
 *      由于编译器优化原因个jvm底层内部模型原因偶然会出现问题  不建议使用
 *
 * */
class SingletonDemo03{

    private static SingletonDemo03 singleton;

    public static SingletonDemo03 getIntseance() {
        if (singleton == null) {
            SingletonDemo03 s;
            synchronized(SingletonDemo03.class) {
                s = singleton;
                if (s == null){
                    synchronized (SingletonDemo03.class) {
                        if (s == null) {
                            return s = new SingletonDemo03();
                        }
                    }
                    singleton = s;
                }
            }
        }
        return  singleton;
    }

}

/**
 *  枚举方式
 *    枚举本身就是单例模式  有JVM从更笨上提供保障 避免了通过反射和反序列化的漏洞
 *
 *          缺点就是不能延迟加载
 * */
enum SingletonDemo04{
    //这个枚举元素本身就是单例
    INSTANCE;

    //可以添加自己的操作功能
    public void singletonOperstion(){

    }
    /*
        调用方式

    SingletonDemo04 sd = SingletonDemo04.INSTANCE;
    SingletonDemo04 sd1 = SingletonDemo04.INSTANCE;
    System.out.println(sd == sd1);

    */
}
