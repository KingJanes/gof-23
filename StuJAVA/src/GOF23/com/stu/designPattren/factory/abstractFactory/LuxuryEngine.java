package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Engine;

public class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("好的引擎  转速快");
    }

    @Override
    public void start() {
        System.out.println("好的引擎 启动快");
    }
}
class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("差的引擎  转速慢");
    }

    @Override
    public void start() {
        System.out.println("差的引擎 启动慢");
    }
}
