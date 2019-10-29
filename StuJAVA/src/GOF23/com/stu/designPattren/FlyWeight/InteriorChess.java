package GOF23.com.stu.designPattren.FlyWeight;

import java.util.Objects;

/**
 * 定义棋子的外部状态
 * */
public class InteriorChess implements FlyWeight{

    //颜色
    private String colorName;
    // 大小
    private int ch;
    //状态
    private String form;

    public InteriorChess(String colorName, int ch, String form) {
        this.setColor(colorName);
        this.setSize(ch);
        this.setAppearance(form);
    }

    //显示棋子的属性
    @Override
    public void addOursideInfo(OutsideChess outsideInterior) {
        //获取棋子的x轴 y轴
        double x = outsideInterior.getX();
        double y = outsideInterior.getY();
        System.out.println(this.getColorName()+"   "+this.getCh()+"   "+this.getForm()+"   位置是：x = "+ x +"   y = "+ y);
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
