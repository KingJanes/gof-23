package GOF23.com.stu.designPattren.factory.ctr.factorys;

import GOF23.com.stu.designPattren.factory.ctr.Audi;
import GOF23.com.stu.designPattren.factory.ctr.Car;

/**
 *   Audi ר�ù�����
 *     ����Audi ʵ��������
 * */
public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
