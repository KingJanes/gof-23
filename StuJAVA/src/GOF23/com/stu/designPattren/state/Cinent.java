package GOF23.com.stu.designPattren.state;
/**
 *
 *
 *          ���� ��
 *                  ģ��һ���Ƶ귿���״̬   �п���״̬ ��ס״̬ �͵ȴ�����״̬
 * */
public class Cinent {
    public static void main(String[] args) {

        SubscriptionState ss = new SubscriptionState();
        CheckInState cks = new CheckInState();
        IdleState is = new IdleState();

        Context context = new Context(is);
        context.newState();         // ��ȡ��ǰ״̬
        context.setState(cks);      // �ı�״̬

        context.newState();
        context.setState(ss);

        context.newState();

    }
}
