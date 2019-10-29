package GOF23.com.stu.designPattren.templateMethod;

public class Client {
    public static void main(String[] args) {

        GoToFeed toFeed = new GoToEat();
        toFeed.template();

        /**
         * 使用匿名类部类调用模板方法
         * */
        new GoToFeed(){
            @Override
            void eat() {
                System.out.println("钱没代沟吃碗面吧");
            }
        }.template();

    }
}
