package GOF23.com.stu.designPattren.builder.builderanddirecyor;


import GOF23.com.stu.designPattren.builder.entity.Engine;
import GOF23.com.stu.designPattren.builder.entity.EscapenTower;
import GOF23.com.stu.designPattren.builder.entity.OrbitalModule;
/**
 *  构建实体组件类
 *    创建组件
 * */
public class TomAriShipBuilder implements AriShipBuilder {
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建Tom轨道舱");
        return new OrbitalModule("Tom牌专用轨道舱");
    }

    @Override
    public EscapenTower builderEscapmTower() {
        System.out.println("构建Tom逃离舱");
        return new EscapenTower("Tom牌专用逃离舱");
    }

    @Override
    public Engine builderEngine() {
        System.out.println("构建Tom牌引擎");
        return new Engine("Tom牌引擎");
    }
}
