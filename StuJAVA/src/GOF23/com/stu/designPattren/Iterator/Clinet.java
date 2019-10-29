package GOF23.com.stu.designPattren.Iterator;

public class Clinet {
    public static void main(String[] args) {

        Aggregate aggregate = new Aggregate();
            aggregate.add("¹ş¹ş");
            aggregate.add("ºÇºÇ");
            aggregate.add("ÎûÎû");
            aggregate.add("À²À²");

        MyInterarot interarot = aggregate.interator();

            while(interarot.hasNext()){
                System.out.println(interarot.get());
                interarot.next();
            }
    }
}
