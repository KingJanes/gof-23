package GOF23.com.stu.designPattren.FlyWeight;

/**
 *
 *  享元抽象接口
 *
 *   模拟一个黑白器
 *
 *      定义内部状态
 * */
public interface FlyWeight {
    //棋子颜色
    void setColor(String colorName);
    //  棋子大小
    void setSize(int ch);
    // 棋子形状
    void setAppearance(String form);
    // 棋子状态 包含内部和外部状态
    void addOursideInfo(OutsideChess outsideInterior);
}
