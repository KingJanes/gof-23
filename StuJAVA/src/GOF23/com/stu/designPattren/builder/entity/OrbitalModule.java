package GOF23.com.stu.designPattren.builder.entity;

public class OrbitalModule {
    //�����
    private String orbitalModuleName;

    public OrbitalModule(String orbitalModuleName) {
        this.orbitalModuleName = orbitalModuleName;
    }

    public String getOrbitalModuleName() {
        return orbitalModuleName;
    }

    public void setOrbitalModuleName(String orbitalModuleName) {
        this.orbitalModuleName = orbitalModuleName;
    }
}
