package GOF23.com.stu.designPattren.bridge;

/**
 *
 *  电脑抽象类.
 *          电脑维度
 * */
public abstract class AbstractComputer {

    //控制访问权限只让子类获取
    protected Berige berige;

    public AbstractComputer(Berige berige) {
        this.berige = berige;
    }

    void sale() {
        berige.sale();
    }

}
/**
 *   笔记本电脑
 * */
class Laptop extends AbstractComputer{

    public Laptop(Berige berige) {
        super(berige);
    }

    @Override
    void sale() {
        System.out.println("销售笔记本电脑...");
        super.sale();

    }
}

/**
 *   台式电脑
 * */
class Desktop extends AbstractComputer{

    public Desktop(Berige berige) {
        super(berige);
    }

    @Override
    void sale() {
        System.out.println("销售台式电脑...");
        super.sale();

    }
}

/**
 *   台式电脑
 * */
class Ipad extends AbstractComputer{

    public Ipad(Berige berige) {
        super(berige);
    }

    @Override
    void sale() {
        System.out.println("销售ipad电脑...");
        super.sale();

    }
}
