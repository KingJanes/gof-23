package GOF23.com.stu.designPattren.Iterator;

public class Clinet {
    public static void main(String[] args) {

        Aggregate aggregate = new Aggregate();
            aggregate.add("����");
            aggregate.add("�Ǻ�");
            aggregate.add("����");
            aggregate.add("����");

        MyInterarot interarot = aggregate.interator();

            while(interarot.hasNext()){
                System.out.println(interarot.get());
                interarot.next();
            }
    }
}
