package GOF23.com.stu.designPattren.ProxyPattern.dynamicProxy;

import GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern.RealStar;
import GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * java.lang.reflect.InvocationHandler  �������ӿ�
 *      ����ͨ��invoke����ʵ����ʵ��ɫ�Ĵ������
 *      ����ͨ��Proxy���ɴ������������Ƕ�Ҫָ����Ӧ�Ĵ���������
 *
 * java.lang.reflect.Proxy; ��̬���ɴ��������
 *
 *
 *   JDK �Դ��Ķ�̬����
 *     javaassist �ֽ������ʵ��
 *     CGLIB
 *     ASM���ײ�ʹ��ָ�� ��ά���Բ
 * */


public class StarHander implements InvocationHandler {
    Star star;

    public StarHander(Star star) {
        this.star = star;
    }
/**
 *
 * ��������ִ�б������ຯ���ǻ�ִ��invoke  �������м������Լ��Ĳ����õ���Ҫ�Ľ��
 *
 * ��������   ����     ��������
 *
 */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke �������ô�������....");
        Object object = null;
        //������ִ�к���֮ǰ��Ӳ���
            if ("sing".equals(method.getName())){
                star.confer();
                star.bookTicket();
                star.signContract();
                object =  method.invoke(star,args);
                star.collectMoney();
            }
        //Ҳ������ִ�к���֮����Ӳ���
        return object;
    }


   public static void doTest() {
        Star star = new RealStar();
        StarHander hander = new StarHander(star);
        //��ȡ���������
                    // �������   ��ӿ�������  hander  ����һ��������
        Star realStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},hander);
        realStar.confer();
        realStar.sing();
    }
}
