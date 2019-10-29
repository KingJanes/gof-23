package GOF23.com.stu.designPattren.state;
/**
 *
 *
 *          场景 ：
 *                  模拟一个酒店房间的状态   有空闲状态 入住状态 和等待订阅状态
 * */
public class Cinent {
    public static void main(String[] args) {

        SubscriptionState ss = new SubscriptionState();
        CheckInState cks = new CheckInState();
        IdleState is = new IdleState();

        Context context = new Context(is);
        context.newState();         // 获取当前状态
        context.setState(cks);      // 改变状态

        context.newState();
        context.setState(ss);

        context.newState();

    }
}
