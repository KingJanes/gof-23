package GOF23.com.stu.designPattren.command;


/**
 *
 * √¸¡Ó¥¶¿Ì’ﬂ
 * */
public class Handler implements IntatcafeHandler{
    private Executant executant;

    public Handler(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void exe() {
       executant.run();
    }
}


interface IntatcafeHandler{

    void exe();
}