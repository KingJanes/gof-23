package GOF23.com.stu.designPattren.mediator;
/**
 *      �з��� ����
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
        System.out.println("���쵼�㱨����");
    }

    @Override
    public void internal() {
        System.out.println("ר���з�");
    }
}
