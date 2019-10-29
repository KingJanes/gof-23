package GOF23.com.stu.designPattren.decorator;


/**
 *
 *
 *   将新增的功能封装成对象   方便真实角色调用
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
        System.out.println("增加新功能   ...空中飞");
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
        System.out.println("增加新功能   ...水上漂");
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
        System.out.println("增加新功能   ...自动驾驶");
    }
}
