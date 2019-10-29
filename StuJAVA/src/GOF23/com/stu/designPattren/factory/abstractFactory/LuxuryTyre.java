package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Tyre;

public class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("�ߵ���̥ ��ĥ�Ժܺ�");
    }
}
class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("�͵���̥ ��ĥ��һ��");
    }
}
