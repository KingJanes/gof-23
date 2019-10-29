package GOF23.com.stu.designPattren.adapter;
/**
 *  适配器
 *      类适配器
 *              将本身继承需要被适配的对象
 * */
public class Adapter2 extends Adaptee implements Target{

    @Override
    public void handleTarget() {
        this.requset();
    }
}
