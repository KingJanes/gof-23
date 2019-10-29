package GOF23.com.stu.designPattren.factory.ctr.factorys;

import GOF23.com.stu.designPattren.factory.ctr.Byd;
import GOF23.com.stu.designPattren.factory.ctr.Car;
/**
 *  Byd 专用工厂类
 *     创建Byd 实例并返回
 * */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
