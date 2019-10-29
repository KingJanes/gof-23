package GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern;
/**
 * �������
 *          �������̿���
 *              ������Ҫҵ����Ҫ������ʵ��ɫ������
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
     *     ������������ʵ����
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
