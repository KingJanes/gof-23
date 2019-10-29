package GOF23.com.stu.designPattren.templateMethod;
/**
 * 放大回调  子类不能调用父类 而通过父类调用子类 这些调用步骤在父类中写好了
 *      完全由父类掌控流程
 *
 * */
public abstract class GoToFeed {
    public void goTo(){
        System.out.println("去饭店...");
    }
    public void pointOrder(){
        System.out.println("点单...");
    }
    public void settle(){
        System.out.println("结账走人...");
    }
    //钩子方法

    abstract void eat();

    /**
     * 模板方法 定义业务流程 具体实现方式让子类实现 一般不让子类重写
     * */
    public final void template(){
        this.goTo();
        this.pointOrder();
        // 调用钩子方法 （方法回调）
        this.eat();
        this.settle();
    }
}
