package GOF23.com.stu.designPattren.factory.ctr;
/**
 * 普通工厂
 *   通过调用者传入参数类型创建对应的示例
 * */
public class CarFactoryByClint {

    public static Car creact(String chrType){
        if ("奥迪".equals(chrType)){
            return  new Audi();
        }else if ("比亚迪".equals(chrType)) {
            return  new Byd();
        }else {
            return  null;
        }
    }
}
