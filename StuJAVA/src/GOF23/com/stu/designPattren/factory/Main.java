package GOF23.com.stu.designPattren.factory;

import GOF23.com.stu.designPattren.factory.abstractFactory.LuxuryCar;
import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.AbstractCarFactory;
import GOF23.com.stu.designPattren.factory.ctr.Audi;
import GOF23.com.stu.designPattren.factory.ctr.Byd;
import GOF23.com.stu.designPattren.factory.ctr.Car;
import GOF23.com.stu.designPattren.factory.ctr.CarFactoryByClint;
import GOF23.com.stu.designPattren.factory.ctr.factorys.AudiFactory;
import GOF23.com.stu.designPattren.factory.ctr.factorys.BydFactory;

//调用者
public class Main {
    public static void main(String[] args) {
       doRun();
       doRun2();
       doRun3();
    }
    public static void doRun () {
        /* 没有工厂模式的情况下
        *   调用者要创建实例  违背了OCP (Open-Closed Principle) 开闭原则
        * */
        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();
    }
    public static void doRun2 () {
        /* 简单工厂模式的情况下  同样违背了OCP开闭原则
         *   调用者要调用工厂类就能拿到实例类
         * */
        Car c1 = CarFactoryByClint.creact("奥迪");
        Car c2 = CarFactoryByClint.creact("比亚迪");
        c1.run();
        c2.run();
    }
    public static void doRun3 () {
        /**
         * 工厂方法模式
         *   调用者调用专用工厂获取对应的工厂示例  如果后期增加新的car子类 则需要创建新的子类以及对应的实例工厂类
         * */
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }

}
