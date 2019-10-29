package GOF23.com.stu.designPattren.command;
/**
 *  真正的命令执行者
 *
 * */
public class Executant {
    public void run () {
        System.out.println(this.getClass().getName().toString());
        System.out.println("Executant run funcation executn over!");

    }
}
