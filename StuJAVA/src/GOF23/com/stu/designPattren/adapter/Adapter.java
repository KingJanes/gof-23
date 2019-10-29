package GOF23.com.stu.designPattren.adapter;
/**
 *  适配器
 *     对象适配器  将需要被适配对象作为参数传递并调用
 *
 * */
public class Adapter implements Target{


    private Adaptee adaptee;
    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void handleTarget() {
        adaptee.requset();
    }
}
