package GOF23.com.stu.designPattren.state;
/**
 *
 * */
public class CheckInState implements IntarfaceState{

    @Override
    public void state() {
        System.out.println("入住状态 等待客户结账离开");
    }
}