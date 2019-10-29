package GOF23.com.stu.designPattren.builder.builderanddirecyor;

import GOF23.com.stu.designPattren.builder.entity.Engine;
import GOF23.com.stu.designPattren.builder.entity.EscapenTower;
import GOF23.com.stu.designPattren.builder.entity.OrbitalModule;

/**
 * �����ɴ��ӿ�
 * */
public interface AriShipBuilder {
    //���������
    OrbitalModule builderOrbitalModule();
    //�������ݲ�
    EscapenTower builderEscapmTower();
    //��������
    Engine builderEngine();

}
