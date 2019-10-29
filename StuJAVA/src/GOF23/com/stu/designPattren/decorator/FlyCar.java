package GOF23.com.stu.designPattren.decorator;


/**
 *
 *
 *   �������Ĺ��ܷ�װ�ɶ���   ������ʵ��ɫ����
 *
 *
 *
 *
 */
public class FlyCar extends DecoratorCar{

    public FlyCar(InterfaceChr car) {
        super(car);
    }
    @Override
    public void move() {
        super.move();
        this.fly();
    }

    public void fly() {
        System.out.println("�����¹���   ...���з�");
    }
}

class WaterCar extends DecoratorCar{

    public WaterCar(InterfaceChr car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        wism();
    }
    public void wism() {
        System.out.println("�����¹���   ...ˮ��Ư");
    }
}

class AICar extends DecoratorCar{

    public AICar(InterfaceChr car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        aotuMove();
    }

    public void aotuMove() {
        System.out.println("�����¹���   ...�Զ���ʻ");
    }
}
