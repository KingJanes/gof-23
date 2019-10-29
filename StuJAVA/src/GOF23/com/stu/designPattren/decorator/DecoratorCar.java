package GOF23.com.stu.designPattren.decorator;
/**
 *  װ����
 *
 * */
public class DecoratorCar implements InterfaceChr {
    protected InterfaceChr car;

    public DecoratorCar(InterfaceChr car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
