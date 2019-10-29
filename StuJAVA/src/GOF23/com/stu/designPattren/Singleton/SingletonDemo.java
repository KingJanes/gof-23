package GOF23.com.stu.designPattren.Singleton;
/**
 *  �������ģʽ
 *
 *  ����ʽ�������ģʽ
 *      �ص�  �̰߳�ȫ ����Ч�ʸߣ�����ֵ��ȡ�������� ���ǲ��ܲ����ӳټ���
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
 *  ����ʽ����
 *      �ص�  �̰߳�ȫ ����Ч�ʵ� �����ӳټ��� �����õ�ʱ��Ŵ���
 *      ����  ÿ�λ�ȡ��������Ҫͬ������Ч�ʵ�
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
 *     ��̬�ڲ��෽ʽ ��Ҳ��һ�������ط�ʽ��
 *
 *   ���ַ�ʽ �̰߳�ȫ����Ч�ʸ� ����ʵ����������
 *     Ҫ�㣺 �ⲿ��û��static ���� ���������ʽ������������
 *      ֻ���������û�ȡ��������ʱ�Ż���ؾ�̬�ڲ��� ������ʱ�߳��ǰ�ȫ�ĵ���������static fainl����
 *      ��֤���ڴ���ֻ������һ��shi������ ����ֻ�ܸ�ֵһ�� �Ӷ���֤���̵߳İ�ȫ��
 *       �汸�˲�����Ч���ú��ӳټ��ص�����
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
 * ˫�ؼ��ģʽ
 *    ����ģʽ��ͬ�����ݷŵ���if�ڲ� �����ִ�е�Ч�ʲ���ÿ�λ�ȡ��������Ҫ����ͬ��
 *       ֻ�е�һ��ִ�в�ͬ������������û��Ҫͬ����
 *
 * ���⣺
 *      ���ڱ������Ż�ԭ���jvm�ײ��ڲ�ģ��ԭ��żȻ���������  ������ʹ��
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
 *  ö�ٷ�ʽ
 *    ö�ٱ�����ǵ���ģʽ  ��JVM�Ӹ������ṩ���� ������ͨ������ͷ����л���©��
 *
 *          ȱ����ǲ����ӳټ���
 * */
enum SingletonDemo04{
    //���ö��Ԫ�ر�����ǵ���
    INSTANCE;

    //��������Լ��Ĳ�������
    public void singletonOperstion(){

    }
    /*
        ���÷�ʽ

    SingletonDemo04 sd = SingletonDemo04.INSTANCE;
    SingletonDemo04 sd1 = SingletonDemo04.INSTANCE;
    System.out.println(sd == sd1);

    */
}
