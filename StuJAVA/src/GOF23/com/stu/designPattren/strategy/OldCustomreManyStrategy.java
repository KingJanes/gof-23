package GOF23.com.stu.designPattren.strategy;
/**
 * 老客户大批量打8折
 * */
public class OldCustomreManyStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("老客户大批量打8折.......");
        return inPrice * 0.8;
    }
}

