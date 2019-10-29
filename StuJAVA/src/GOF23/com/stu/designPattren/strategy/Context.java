package GOF23.com.stu.designPattren.strategy;
/**
 *      算法上下文
 *
 *              负责具体策略类的交互
 *                  吧算法与客户端分离 使得算法可以独立与客户端变化
 *
 * */
public class Context {

    //当前策略对象
    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void printPirce(double price){

        //使用当前对象获取
        System.out.println(strategy.getPrice(price));
        //return strategy.getPrice(price);
    }
}
