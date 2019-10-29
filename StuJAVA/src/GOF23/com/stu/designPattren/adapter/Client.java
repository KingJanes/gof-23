package GOF23.com.stu.designPattren.adapter;

/**
 *
 *  用户
 * */
public class Client {
    public static void main(String[] args) {
        // 对象适配器
        Target target = new Adapter(new Adaptee());
                target.handleTarget();

        // 类适配器
        Target target1 = new Adapter2();
        target1.handleTarget();
    }
}

