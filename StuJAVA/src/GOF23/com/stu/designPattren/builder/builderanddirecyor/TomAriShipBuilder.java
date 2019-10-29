package GOF23.com.stu.designPattren.builder.builderanddirecyor;


import GOF23.com.stu.designPattren.builder.entity.Engine;
import GOF23.com.stu.designPattren.builder.entity.EscapenTower;
import GOF23.com.stu.designPattren.builder.entity.OrbitalModule;
/**
 *  ����ʵ�������
 *    �������
 * */
public class TomAriShipBuilder implements AriShipBuilder {
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("����Tom�����");
        return new OrbitalModule("Tom��ר�ù����");
    }

    @Override
    public EscapenTower builderEscapmTower() {
        System.out.println("����Tom�����");
        return new EscapenTower("Tom��ר�������");
    }

    @Override
    public Engine builderEngine() {
        System.out.println("����Tom������");
        return new Engine("Tom������");
    }
}
