package GOF23.com.stu.designPattren.FlyWeight;

import java.util.Objects;

/**
 * �������ӵ��ⲿ״̬
 * */
public class InteriorChess implements FlyWeight{

    //��ɫ
    private String colorName;
    // ��С
    private int ch;
    //״̬
    private String form;

    public InteriorChess(String colorName, int ch, String form) {
        this.setColor(colorName);
        this.setSize(ch);
        this.setAppearance(form);
    }

    //��ʾ���ӵ�����
    @Override
    public void addOursideInfo(OutsideChess outsideInterior) {
        //��ȡ���ӵ�x�� y��
        double x = outsideInterior.getX();
        double y = outsideInterior.getY();
        System.out.println(this.getColorName()+"   "+this.getCh()+"   "+this.getForm()+"   λ���ǣ�x = "+ x +"   y = "+ y);
    }
    @Override
    public void setColor(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void setSize(int ch) {
        this.ch = ch;
    }

    @Override
    public void setAppearance(String form) {
        this.form = form;
    }



    public String getColorName() {
        return colorName;
    }

    public int getCh() {
        return ch;
    }

    public String getForm() {
        return form;
    }

}
