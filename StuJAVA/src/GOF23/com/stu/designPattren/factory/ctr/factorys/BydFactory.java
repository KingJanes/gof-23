package GOF23.com.stu.designPattren.factory.ctr.factorys;

import GOF23.com.stu.designPattren.factory.ctr.Byd;
import GOF23.com.stu.designPattren.factory.ctr.Car;
/**
 *  Byd ר�ù�����
 *     ����Byd ʵ��������
 * */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
