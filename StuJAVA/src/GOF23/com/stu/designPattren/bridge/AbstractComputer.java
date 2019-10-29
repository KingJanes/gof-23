package GOF23.com.stu.designPattren.bridge;

/**
 *
 *  ���Գ�����.
 *          ����ά��
 * */
public abstract class AbstractComputer {

    //���Ʒ���Ȩ��ֻ�������ȡ
    protected Berige berige;

    public AbstractComputer(Berige berige) {
        this.berige = berige;
    }

    void sale() {
        berige.sale();
    }

}
/**
 *   �ʼǱ�����
 * */
class Laptop extends AbstractComputer{

    public Laptop(Berige berige) {
        super(berige);
    }

    @Override
    void sale() {
        System.out.println("���۱ʼǱ�����...");
        super.sale();

    }
}

/**
 *   ̨ʽ����
 * */
class Desktop extends AbstractComputer{

    public Desktop(Berige berige) {
        super(berige);
    }

    @Override
    void sale() {
        System.out.println("����̨ʽ����...");
        super.sale();

    }
}

/**
 *   ̨ʽ����
 * */
class Ipad extends AbstractComputer{

    public Ipad(Berige berige) {
        super(berige);
    }

    @Override
    void sale() {
        System.out.println("����ipad����...");
        super.sale();

    }
}
