package GOF23.com.stu.designPattren.composite.demo;

/**
 *      ʹ�����ģʽ ģ��һ��ɱ�����
 *
 * */

public interface Component {
    // ɱ��
    void antiVirus();
}
/**
 *  ����
 * */
 interface AbstaricCompositeFiles extends Component {

    //��ɾ  �ļ�
    void add(Component file);
    void revemo(int index);

    @Override
     void antiVirus();
 }
 /**
  * Ҷ��
  * */
interface AbstaricCompositeFile extends Component {

    // �������ļ���
    void rename(String newNmae);

    @Override
    void antiVirus();
}
