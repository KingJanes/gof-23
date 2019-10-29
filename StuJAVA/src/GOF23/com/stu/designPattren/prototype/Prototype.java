package GOF23.com.stu.designPattren.prototype;

import java.util.Date;

public class Prototype {

    // ǳ��¡  �Ὣԭ�κͿ�¡����ʹ��ͬһ�����Ա���ʱ�� �������¡����
    // ����޸�����ֵԭ�κͿ�¡��������Զ�����֮�ı�
    static void newClone() throws CloneNotSupportedException {
        Date time = new Date(1544624645646L);
        NewSheep s = new NewSheep("������" ,time);

        System.out.println(s.getName() + "   " + s.getDate().toString());


        NewSheep s1 = (NewSheep) s.clone();


        time.setTime(96565656564L);
        System.out.println("��������ʱ���....." + s.getName() + "   " + s.getDate().toString());
        System.out.println(s1.getName() + "   " + s1.getDate().toString());
    }



    //���¡ �Ὣ���Է��� �γ�1��1 ��������
    static void cloneSheep() throws CloneNotSupportedException {

        System.out.println( "   -----------------------�ָ���------------------------------------" );


        Date time = new Date(1844624645646L);
        CloneSheep s1 = new CloneSheep("ŷ��",time);
            System.out.println(s1.getName() + "   " + s1.getDate().toString());

            CloneSheep s2 = (CloneSheep) s1.clone();
            time.setTime(66565656564L);
        System.out.println("��������ʱ���....." + s1.getName() + "   " + s1.getDate().toString());
        System.out.println(s2.getName() + "   " + s2.getDate().toString());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        newClone();
        cloneSheep();
    }
}
