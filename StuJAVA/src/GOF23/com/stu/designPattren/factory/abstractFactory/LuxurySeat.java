package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Seat;

public class LuxurySeat implements Seat {
    @Override
    public void function() {
        System.out.println("高档座椅   带有按摩功能");
    }
}
class LowSeat implements Seat {

    @Override
    public void function() {
        System.out.println("一般座椅   没有按摩功能");
    }
}