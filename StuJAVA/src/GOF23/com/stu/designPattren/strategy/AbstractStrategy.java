package GOF23.com.stu.designPattren.strategy;
/**
 *  获取打折后的算法交互接口
 *
 * */
public interface AbstractStrategy {

    double getPrice(double inPrice);
}
