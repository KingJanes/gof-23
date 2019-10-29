package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.AbstractCarFactory;

public class Main {
    public static void main(String[] args) {

        cretar();
    }

    public static void cretar() {
        AbstractCarFactory car1 = new LuxuryCar();
        car1.createEngine();
        car1.createSeat();
        car1.createTyre();

        System.out.println("_____________________________________________________________________");
        AbstractCarFactory car2 = new LowCar();
        car2.createEngine();
        car2.createSeat();
        car2.createTyre();
    }
}
