package GOF23.com.stu.designPattren.strategy;

/**
 * �¿ͻ���������9��
 * */
public class NewCustomreManyStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("�¿ͻ���������9��.......");
        return inPrice * 0.9;
    }
}
