package GOF23.com.stu.designPattren.bridge;

/**
 * �Ž�ģʽ  ����ӿ�
 *
 *      ����ά��
 * */
public interface Berige {
    void sale ();
}


class Lenovo implements Berige{
    @Override
    public void sale() {
        System.out.println("����");
    }
}
class Dell implements Berige{
    @Override
    public void sale() {
        System.out.println("����");
    }
}
class Samsung implements Berige{
    @Override
    public void sale() {
        System.out.println("����");
    }
}



