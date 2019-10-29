package GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern;
/**
 * 代理对象
 *          负责流程控制
 *              但是主要业务还是要调用真实角色的任务
 * */
public class ProxyStar implements Star{

    private Star star;

    public ProxyStar(Star star) {
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");

    }

    /**
     *
     *     代理对象调用真实对象
     * */
    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");

    }
}
