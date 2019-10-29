package GOF23.com.stu.designPattren.mediator;

/**
 *      ���� ����
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
        System.out.println(this.getClass().getName()+"..Ҳ���");
    }

    @Override
    public void external() {
        System.out.println("���쵼�㱨��˾ʣ���ʽ�");
    }

    @Override
    public void internal() {
        System.out.println("ר����Ǯ");
    }
}

