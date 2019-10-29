package GOF23.com.stu.designPattren.builder.entity;

/**
 *
 *   假飞船实体类
 * */
public class AriShip {
    //轨道舱
    private OrbitalModule orbitalModule;
    //引擎
    private Engine engine;
    //逃离舱
    private EscapenTower escapenTower;

    public void run () {
        System.out.println("启动引擎.....");
        System.out.println("飞船也成功起飞！");
    }
    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapenTower getEscapeTower() {
        return escapenTower;
    }

    public void setEscapeTower(EscapenTower escapenTower) {
        this.escapenTower = escapenTower;
    }
}



