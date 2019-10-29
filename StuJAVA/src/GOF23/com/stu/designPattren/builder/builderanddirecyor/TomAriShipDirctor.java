package GOF23.com.stu.designPattren.builder.builderanddirecyor;

import GOF23.com.stu.designPattren.builder.entity.AriShip;
import GOF23.com.stu.designPattren.builder.entity.Engine;
import GOF23.com.stu.designPattren.builder.entity.EscapenTower;
import GOF23.com.stu.designPattren.builder.entity.OrbitalModule;
/**
 *    ����ʵ����
 *
 * */
public class TomAriShipDirctor  implements AriShipDcetor{

    //���
    private AriShipBuilder builder;

    public TomAriShipDirctor(AriShipBuilder builder) {
        this.builder = builder;
    }
    /**
     *
     * �������װ��ɷɴ�������
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
