package GOF23.com.stu.designPattren.factory.ctr.factorys;

import GOF23.com.stu.designPattren.factory.ctr.Audi;
import GOF23.com.stu.designPattren.factory.ctr.Car;

/**
 *   Audi 专用工厂类
 *     创建Audi 实例并返回
 * */
public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
