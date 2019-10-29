package bean;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.width);
    }
}
class A {



    static {
        width = 300;
        System.out.println("static run ......");
    }
    public static int width = 100;

    public A() {
        System.out.println("constructor run ......");
    }
}
