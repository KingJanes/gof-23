package GOF23.com.stu.designPattren.mediator;


/**
 *
 * �н��߶���ӿ�
 * */
public interface MediatorIntarface {

    //����ͬ�¶���
    void relevance( String name , ColleaguesIntarface colleagues);

    //�����ṩ֪ͨͬ�¶���ִ��
    void command(String name);

}
