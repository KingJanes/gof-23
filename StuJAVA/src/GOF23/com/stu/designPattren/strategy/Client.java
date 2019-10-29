package GOF23.com.stu.designPattren.strategy;
/**
 *
 *
 *          ���� ��
 *
 *                 ĳ���г���Ա�ӵ�����ı��۲��ԣ�CRMϵͳ�г������⣩ ���ۼ򵥷���
 *
 *                 - ��ͨ�ͻ�С��������
 *                 - ��ͨ�ͻ�����������
 *                 - �Ͽͻ�С��������
 *                 - �Ͽͻ�����������
 *
 *
 * */
public class Client {

    public static void main(String[] args) {
        /**
         *      ʹ�ò���ģʽ
         * */

        AbstractStrategy strategy1 = new NewCustomreFweStrategy();
        AbstractStrategy strategy2 = new OldCustomreManyStrategy();
        Context context = new Context(strategy1);
            context.printPirce(2644.56);
            context.setStrategy(strategy2);
            context.printPirce(2644.56);
            System.out.println("---------------------------------------------------------------");

/**
 *  ��ͨ����ʵ��
 *      ʵ���������� ����Υ���˿���ԭ��
 *          ���������ر���㷨�Ƚϸ���ʱ����������ʱ �㷨�����ر𳤲�����ά��
 * */
    double price1 = 0.0;
    price1 = getPrice("�Ͽͻ�������",2564.2);
    System.out.println(price1);


    }




    private static double getPrice(String type ,double price) {

        if ("��ͨ�ͻ�С����".equals(type)){
            System.out.println("��ͨ�ͻ�С���� ������");
            return price;

        }else if("��ͨ�ͻ�������".equals(type)){

            System.out.println("��ͨ�ͻ������� ��9��");
            return price * 0.9;

        }else if("�Ͽͻ�С����".equals(type)){

            System.out.println("�Ͽͻ������� ��8.5��");
            return price * 0.85;

        }else if("�Ͽͻ�������".equals(type)){

            System.out.println("�Ͽͻ������� ��8��");
            return price * 0.8;
        }
        System.out.println("δ�ҵ��ͻ����Ͳ�����");
        return price;
    }
}
