package GOF23.com.stu.designPattren.FlyWeight;

/**
 *
 *  ��Ԫ����ӿ�
 *
 *   ģ��һ���ڰ���
 *
 *      �����ڲ�״̬
 * */
public interface FlyWeight {
    //������ɫ
    void setColor(String colorName);
    //  ���Ӵ�С
    void setSize(int ch);
    // ������״
    void setAppearance(String form);
    // ����״̬ �����ڲ����ⲿ״̬
    void addOursideInfo(OutsideChess outsideInterior);
}
