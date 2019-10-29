package GOF23.com.stu.designPattren.bridge;

/**
 * 桥接模式  顶层接口
 *
 *      名牌维度
 * */
public interface Berige {
    void sale ();
}


class Lenovo implements Berige{
    @Override
    public void sale() {
        System.out.println("联想");
    }
}
class Dell implements Berige{
    @Override
    public void sale() {
        System.out.println("戴尔");
    }
}
class Samsung implements Berige{
    @Override
    public void sale() {
        System.out.println("三星");
    }
}



