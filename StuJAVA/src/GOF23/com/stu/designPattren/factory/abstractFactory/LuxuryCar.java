package GOF23.com.stu.designPattren.factory.abstractFactory;

import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.AbstractCarFactory;
import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Engine;
import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Seat;
import GOF23.com.stu.designPattren.factory.abstractFactory.factorys.Tyre;
/**
 * 创建一个高配的Car 配件
 * */
public class LuxuryCar  implements AbstractCarFactory {
    @Override
    public Engine createEngine() {
        Engine engine = new LuxuryEngine();
        engine.run();
        engine.start();
        return engine;
    }

    @Override
    public Seat createSeat() {
        Seat seat = new LuxurySeat() ;
        seat.function();
        return seat;
    }

    @Override
    public Tyre createTyre() {
        Tyre tyre  = new LuxuryTyre();
        tyre.revolve();
        return tyre;
    }
}

/**
 * 创建一个低配的Car 配件
 * */
class LowCar  implements AbstractCarFactory {
    @Override
    public Engine createEngine() {
        Engine engine = new LowEngine();
        engine.run();
        engine.start();
        return engine;
}

    @Override
    public Seat createSeat() {
        Seat seat = new LowSeat() ;
        seat.function();
        return seat;
    }

    @Override
    public Tyre createTyre() {
        Tyre tyre  = new LowTyre();
        tyre.revolve();
        return tyre;
    }
}
