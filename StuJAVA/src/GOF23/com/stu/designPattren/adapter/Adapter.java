package GOF23.com.stu.designPattren.adapter;
/**
 *  ������
 *     ����������  ����Ҫ�����������Ϊ�������ݲ�����
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
