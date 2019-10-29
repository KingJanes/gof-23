package GOF23.com.stu.designPattren.mediator;
/**
 *     项目部 对象
 *
 * */
public class Market implements ColleaguesIntarface{

    private MediatorImpl mediator;

    public Market(MediatorImpl mediator) {
        this.mediator = mediator;
        init();
    }

    private void init() {
        mediator.relevance("Market",this);
    }

    @Override
    public void external() {
        System.out.println("向领导汇报业务进度 需要资金 向领导申请");
        mediator.command("Finacial");
    }

    @Override
    public void internal() {
        System.out.println("跑去接项目");
    }
}
