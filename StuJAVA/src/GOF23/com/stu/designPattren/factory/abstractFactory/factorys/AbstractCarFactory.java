package GOF23.com.stu.designPattren.factory.abstractFactory.factorys;

public interface AbstractCarFactory {
     // 构造引擎
     Engine createEngine();
     //构造座椅
     Seat createSeat();
     //构造轮胎
     Tyre createTyre();
}
