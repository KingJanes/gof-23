package GOF23.com.stu.designPattren.decorator;

public class Mian {
    public static void main(String[] args) {
        EntityCar car = new EntityCar();
        FlyCar car1 = new FlyCar(car);

        WaterCar car2 = new WaterCar(car1);

        AICar aiCar = new AICar(new WaterCar(new FlyCar(new EntityCar())));
        aiCar.move();
      //  car2.move();

    }
}
