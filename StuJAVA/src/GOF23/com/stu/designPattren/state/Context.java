package GOF23.com.stu.designPattren.state;
/**
 *
 *  ״̬������  ά����һ��state���� �����˵�ǰ״̬
 * */
public class Context {

    private IntarfaceState state;

    public Context(IntarfaceState state) {
        this.state = state;
    }

    public void setState(IntarfaceState state) {
        this.state = state;
    }
    public void newState(){
        state.state();
    }
}
