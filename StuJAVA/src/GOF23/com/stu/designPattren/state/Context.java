package GOF23.com.stu.designPattren.state;
/**
 *
 *  状态环境类  维护着一个state对象 定义了当前状态
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
