package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Seat;

public class LuxurySeat implements Seat {
    @Override
    public void function() {
        System.out.println("�ߵ�����   ���а�Ħ����");
    }
}
class LowSeat implements Seat {

    @Override
    public void function() {
        System.out.println("һ������   û�а�Ħ����");
    }
}