package GOF23.com.stu.designPattren.templateMethod;

public class Client {
    public static void main(String[] args) {

        GoToFeed toFeed = new GoToEat();
        toFeed.template();

        /**
         * ʹ�������ಿ�����ģ�巽��
         * */
        new GoToFeed(){
            @Override
            void eat() {
                System.out.println("Ǯû�����������");
            }
        }.template();

    }
}
