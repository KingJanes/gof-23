package GOF23.com.stu.designPattren.factory;

import GOF23.com.stu.designPattren.factory.abstractFactory.LuxuryCar;
import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.AbstractCarFactory;
import GOF23.com.stu.designPattren.factory.ctr.Audi;
import GOF23.com.stu.designPattren.factory.ctr.Byd;
import GOF23.com.stu.designPattren.factory.ctr.Car;
import GOF23.com.stu.designPattren.factory.ctr.CarFactoryByClint;
import GOF23.com.stu.designPattren.factory.ctr.factorys.AudiFactory;
import GOF23.com.stu.designPattren.factory.ctr.factorys.BydFactory;

//������
public class Main {
    public static void main(String[] args) {
       doRun();
       doRun2();
       doRun3();
    }
    public static void doRun () {
        /* û�й���ģʽ�������
        *   ������Ҫ����ʵ��  Υ����OCP (Open-Closed Principle) ����ԭ��
        * */
        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();
    }
    public static void doRun2 () {
        /* �򵥹���ģʽ�������  ͬ��Υ����OCP����ԭ��
         *   ������Ҫ���ù���������õ�ʵ����
         * */
        Car c1 = CarFactoryByClint.creact("�µ�");
        Car c2 = CarFactoryByClint.creact("���ǵ�");
        c1.run();
        c2.run();
    }
    public static void doRun3 () {
        /**
         * ��������ģʽ
         *   �����ߵ���ר�ù�����ȡ��Ӧ�Ĺ���ʾ��  ������������µ�car���� ����Ҫ�����µ������Լ���Ӧ��ʵ��������
         * */
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }

}
