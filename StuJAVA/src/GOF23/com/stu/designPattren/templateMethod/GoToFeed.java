package GOF23.com.stu.designPattren.templateMethod;
/**
 * �Ŵ�ص�  ���಻�ܵ��ø��� ��ͨ������������� ��Щ���ò����ڸ�����д����
 *      ��ȫ�ɸ����ƿ�����
 *
 * */
public abstract class GoToFeed {
    public void goTo(){
        System.out.println("ȥ����...");
    }
    public void pointOrder(){
        System.out.println("�㵥...");
    }
    public void settle(){
        System.out.println("��������...");
    }
    //���ӷ���

    abstract void eat();

    /**
     * ģ�巽�� ����ҵ������ ����ʵ�ַ�ʽ������ʵ�� һ�㲻��������д
     * */
    public final void template(){
        this.goTo();
        this.pointOrder();
        // ���ù��ӷ��� �������ص���
        this.eat();
        this.settle();
    }
}
