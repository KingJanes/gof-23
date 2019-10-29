package GOF23.com.stu.designPattren.decorator;

/**
 *   真实角色
 */
public class EntityCar implements InterfaceChr {
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}
