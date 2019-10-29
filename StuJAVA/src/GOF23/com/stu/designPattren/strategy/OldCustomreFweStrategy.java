package GOF23.com.stu.designPattren.strategy;

/**
 * 老客户小批量打8.5折
 * */
public class OldCustomreFweStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("老客户小批量打8.5折.......");
        return inPrice * 0.85;
    }
}