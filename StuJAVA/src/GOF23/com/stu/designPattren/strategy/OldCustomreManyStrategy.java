package GOF23.com.stu.designPattren.strategy;
/**
 * �Ͽͻ���������8��
 * */
public class OldCustomreManyStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("�Ͽͻ���������8��.......");
        return inPrice * 0.8;
    }
}

