package GOF23.com.stu.designPattren.FlyWeight;
/**
 *
 * �������ӵ��ⲿ״̬ ���ɹ�����
 *
 * */
public class OutsideChess {
    // ���ӵ�x ��
    private double x;
    // ���ӵ� ��
    private double y;

    public OutsideChess(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
