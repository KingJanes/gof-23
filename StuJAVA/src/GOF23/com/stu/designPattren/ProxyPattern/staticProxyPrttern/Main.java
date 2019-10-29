package GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern;

import GOF23.com.stu.designPattren.ProxyPattern.dynamicProxy.StarHander;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

     // staticPorxy();
      dynaimcProxy();
    }
    /***
     * ��̬����
     *
     */
    static void dynaimcProxy() {
        StarHander.doTest();

    }
    /**
     *
     * ��̬����
     * */
    static void staticPorxy() {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.bookTicket();
        proxy.signContract();
        proxy.sing();
        proxy.collectMoney();
    }
}
