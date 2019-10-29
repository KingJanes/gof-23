package GOF23.com.stu.designPattren.mediator;

/**
 *      财务部 对象
 *
 * */
public class Finacial implements ColleaguesIntarface{

    private MediatorImpl mediator;

    public Finacial(MediatorImpl mediator) {
        this.mediator = mediator;
        init();
    }

    private void init() {

        mediator.relevance("Finacial",this);
        System.out.println(this.getClass().getName()+"..也添加");
    }

    @Override
    public void external() {
        System.out.println("向领导汇报公司剩余资金");
    }

    @Override
    public void internal() {
        System.out.println("专心数钱");
    }
}

