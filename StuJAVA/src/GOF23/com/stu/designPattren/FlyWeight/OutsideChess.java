package GOF23.com.stu.designPattren.FlyWeight;
/**
 *
 * 定义棋子的外部状态 不可共享部分
 *
 * */
public class OutsideChess {
    // 棋子的x 轴
    private double x;
    // 棋子的 轴
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
