package GOF23.com.stu.designPattren.builder.entity;

/**
 *
 *   �ٷɴ�ʵ����
 * */
public class AriShip {
    //�����
    private OrbitalModule orbitalModule;
    //����
    private Engine engine;
    //�����
    private EscapenTower escapenTower;

    public void run () {
        System.out.println("��������.....");
        System.out.println("�ɴ�Ҳ�ɹ���ɣ�");
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



