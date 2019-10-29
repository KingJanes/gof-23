package GOF23.com.stu.designPattren.chainOfResponsibility;

/**
 *
 *
 *      ������
 *
 *          ��˾��SCM��Supply Chain Management ��Ӧ������ϵͳ�вɹ���Ƨ��ϵͳ�����
 *
 *                  �ɹ����С��5�� ��������
 *                  �ɹ����С�ڴ��ڵ���5��  С��10�� ��������   director
 *                  �ɹ����С�ڴ��ڵ���10��  С��20�� ����������  vice manager
 *                  �ɹ����С�ڴ��ڵ���20��  �ܾ�������   general manager
 *                  �ɹ�������20�� ��ͨ��

 * */

/**
 *
 * �����쵼
 *
 */
public interface InterfaceLead {
    void requsetHanddle(Applicant staff);
    void nextLead(InterfaceLead nextLead);
}
