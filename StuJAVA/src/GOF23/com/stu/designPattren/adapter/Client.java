package GOF23.com.stu.designPattren.adapter;

/**
 *
 *  �û�
 * */
public class Client {
    public static void main(String[] args) {
        // ����������
        Target target = new Adapter(new Adaptee());
                target.handleTarget();

        // ��������
        Target target1 = new Adapter2();
        target1.handleTarget();
    }
}

