package GOF23.com.stu.designPattren.mediator;

public class Main {
    public static void main(String[] args) {

        MediatorImpl mediato = new MediatorImpl();
        Develepment develepment = new Develepment(mediato);
        Finacial  finacial =new Finacial(mediato);
        Market market = new Market(mediato);

           market.external();
           market.internal();
    }
}
