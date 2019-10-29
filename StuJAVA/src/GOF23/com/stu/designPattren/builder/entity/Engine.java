package GOF23.com.stu.designPattren.builder.entity;
public class Engine {
    //ÒýÇæ
    private String engineName;

    public Engine(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
}