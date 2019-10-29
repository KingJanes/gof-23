package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Engine;

public class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("�õ�����  ת�ٿ�");
    }

    @Override
    public void start() {
        System.out.println("�õ����� ������");
    }
}
class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("�������  ת����");
    }

    @Override
    public void start() {
        System.out.println("������� ������");
    }
}
