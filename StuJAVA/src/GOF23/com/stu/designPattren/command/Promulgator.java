package GOF23.com.stu.designPattren.command;
/**
 *
 * �������
 * */
public class Promulgator {
    private IntatcafeHandler handler;

    public Promulgator(IntatcafeHandler handler) {
        this.handler = handler;
    }
    public void call(){
        handler.exe();
    }
}
