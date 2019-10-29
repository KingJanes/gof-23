package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Tyre;

public class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("高档轮胎 耐磨性很好");
    }
}
class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("低档轮胎 耐磨性一般");
    }
}
