package GOF23.com.stu.designPattren.builder.builderanddirecyor;

import GOF23.com.stu.designPattren.builder.entity.Engine;
import GOF23.com.stu.designPattren.builder.entity.EscapenTower;
import GOF23.com.stu.designPattren.builder.entity.OrbitalModule;

/**
 * 构建飞船接口
 * */
public interface AriShipBuilder {
    //构建轨道舱
    OrbitalModule builderOrbitalModule();
    //构建逃逸舱
    EscapenTower builderEscapmTower();
    //构建引擎
    Engine builderEngine();

}
