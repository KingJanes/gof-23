package GOF23.com.stu.designPattren.strategy;
/**
 * 新客户小批量不打折
 * */
public class NewCustomreFweStrategy implements AbstractStrategy{

    @Override
    public double getPrice(double inPrice) {
        System.out.println("新客户小批量不打折.......");
        return inPrice;
    }
}
