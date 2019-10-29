package GOF23.com.stu.designPattren.bridge;

public class Main {
    public static void main(String[] args) {

        AbstractComputer ac = new Laptop(new Lenovo());
             ac.sale();
        AbstractComputer ac1 = new Ipad(new Samsung());
            ac1.sale();
    }
}
