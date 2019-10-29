package GOF23.com.stu.designPattren.strategy;

/**
 * 新客户大批量打9折
 * */
public class NewCustomreManyStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("新客户大批量打9折.......");
        return inPrice * 0.9;
    }
}
