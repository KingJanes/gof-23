package GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern;
/**
 *
 *      ��̬������ʾ��
 *                  ģ����ĳ�����ǳ���
 *
 *
 *   �������ӿ�
 *       �����������ǵĽ�̸����
 *
 *           confer    //��̸
 *           signContract //ǩ��ͬ
 *           bookTicket //��Ʊ
 *           sing   //����
 *           collectMoney //��β��
 *
 *
 */


public interface Star {

     void confer ();
     void signContract();
     void bookTicket();
     void sing();
     void collectMoney();
}
