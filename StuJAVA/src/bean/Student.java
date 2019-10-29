package bean;

public class Student {


    private String name = " 这是默认的名字";
    private int age;

    public Student (){

        System.out.println(" 这是无参构造函数。。。。");
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(" 这是有参构造函数。。。。");
    }
    private Student(String name) {
        this.name = name;
        System.out.println(" 这是有参私有构造函数。。。。");
    }

    public String getName() {
        System.out.println(" getName run....");
        return name;

    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    private void noParameter(){

        System.out.println(" 这是无参私有函数。。。。");
    }

    private void publicNoParameter(){

        System.out.println(" 这是无参共有函数。。。。");
    }

    private void setAgeTo(String name) {
        this.name = name;
        System.out.println(" 这是有参参私有函数2。。。。");
    }

    private void setNameTo(String name){
        this.name = name;
        System.out.println(" 这是有参参私有函数1。。。。");
    }
}
