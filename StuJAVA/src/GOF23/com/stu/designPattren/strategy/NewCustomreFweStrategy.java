package GOF23.com.stu.designPattren.strategy;
/**
 * �¿ͻ�С����������
 * */
public class NewCustomreFweStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("�¿ͻ�С����������.......");
        return inPrice;
    }
}
