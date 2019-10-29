package GOF23.com.stu.designPattren.builder.builderanddirecyor;

import GOF23.com.stu.designPattren.builder.entity.AriShip;
import GOF23.com.stu.designPattren.builder.entity.Engine;
import GOF23.com.stu.designPattren.builder.entity.EscapenTower;
import GOF23.com.stu.designPattren.builder.entity.OrbitalModule;
/**
 *    创建实体类
 *
 * */
public class TomAriShipDirctor  implements AriShipDcetor{

    //组件
    private AriShipBuilder builder;

    public TomAriShipDirctor(AriShipBuilder builder) {
        this.builder = builder;
    }
    /**
     *
     * 创建组件装配成飞船并返回
     *
     * */
    @Override
    public AriShip cerateAriShip() {
        OrbitalModule om = builder.builderOrbitalModule();
        Engine eng = builder.builderEngine();
        EscapenTower et = builder.builderEscapmTower();
        AriShip as = new AriShip();
        as.setOrbitalModule(om);
        as.setEngine(eng);
        as.setEscapeTower(et);
        return as;
    }
}
