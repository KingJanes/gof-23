package GOF23.com.stu.designPattren.factory.abstractFactory.factorys;

public interface AbstractCarFactory {
     // ��������
     Engine createEngine();
     //��������
     Seat createSeat();
     //������̥
     Tyre createTyre();
}
