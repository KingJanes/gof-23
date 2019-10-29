package GOF23.com.stu.designPattren.mediator;
/**
 *      研发部 对象
 *
 * */
public class Develepment implements ColleaguesIntarface{

    private MediatorImpl mediator;

    public Develepment(MediatorImpl mediator) {
        this.mediator = mediator;
        init();
    }

    private void init() {
        mediator.relevance("Develepment",this);
    }

    @Override
    public void external() {
        System.out.println("向领导汇报工作");
    }

    @Override
    public void internal() {
        System.out.println("专心研发");
    }
}
