package GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern;
/**
 *   真实角色
 *          某个明星
 *
 * */
public class RealStar implements Star{

    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");

    }

    @Override
    public void sing() {
        System.out.println("RealStar(周明星本人).sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");

    }
}
