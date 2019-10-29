package GOF23.com.stu.designPattren.composite;


/**
 *
 * Component  ���󹹽�  ������Ҷ�Ӻ������Ĺ�ͬ��
 * */
public interface AbstaictComponent {
    // ���� ��Ҷ�ӵĹ�ͬ��
    void opertion();
}
/**
 *  Ҷ�ӹ���    û���ӽڵ�ľ���Ҷ��
 * */
interface AbstaictLeaf extends AbstaictComponent{
    @Override
    void opertion();
}
/**
 *
 *  ��������   �������Լ������� �нڵ�
 * */
interface AbstarictComposite extends  AbstaictComponent {

    //��ɾ�޸�
    void add();
    void remove();
    void reprice();
    void set(int index , AbstaictLeaf childre);

    @Override
    void opertion();
}

