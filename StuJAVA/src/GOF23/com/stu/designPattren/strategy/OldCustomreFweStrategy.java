package GOF23.com.stu.designPattren.strategy;

/**
 * �Ͽͻ�С������8.5��
 * */
public class OldCustomreFweStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("�Ͽͻ�С������8.5��.......");
        return inPrice * 0.85;
    }
}