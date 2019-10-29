package GOF23.com.stu.designPattren.command;

public class Main {
    public static void main(String[] args) {
        new Promulgator(new Handler(new Executant())).call();

    }
}
