package GOF23.com.stu.designPattren.adapter;
/**
 *  ������
 *      ��������
 *              ������̳���Ҫ������Ķ���
 * */
public class Adapter2 extends Adaptee implements Target{

    @Override
    public void handleTarget() {
        this.requset();
    }
}
