package GOF23.com.stu.designPattren.mediator;
/**
 *     ��Ŀ�� ����
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
        System.out.println("���쵼�㱨ҵ����� ��Ҫ�ʽ� ���쵼����");
        mediator.command("Finacial");
    }

    @Override
    public void internal() {
        System.out.println("��ȥ����Ŀ");
    }
}
