package GOF23.com.stu.designPattren.Iterator;
/**
 * �����������  ���������ݾۺ϶����ಿ��ʵ��
 * */
public interface MyInterarot {
    // ��ȡ��ǰԪ��
    Object get();
    // ���α�����Ϊ0
    void first();
    // ��ȡԪ�ص�����  �α�cursor
    int of (Object obj);
    // ��ȡԪ�ظ���
    int size();
    // �ж��Ƿ�����һ��Ԫ��
    boolean hasNext();
    //ָ����һ��Ԫ��
    void next ();
    // �ж��Ƿ���һ��Ԫ��
    boolean isFirst();
    // �ж��Ƿ������һ��Ԫ��
    boolean isLast();
}
