package GOF23.com.stu.designPattren.strategy;
/**
 *      �㷨������
 *
 *              ������������Ľ���
 *                  ���㷨��ͻ��˷��� ʹ���㷨���Զ�����ͻ��˱仯
 *
 * */
public class Context {

    //��ǰ���Զ���
    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void printPirce(double price){

        //ʹ�õ�ǰ�����ȡ
        System.out.println(strategy.getPrice(price));
        //return strategy.getPrice(price);
    }
}
