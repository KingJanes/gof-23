package GOF23.com.stu.designPattren.factory.ctr;
/**
 * ��ͨ����
 *   ͨ�������ߴ���������ʹ�����Ӧ��ʾ��
 * */
public class CarFactoryByClint {

    public static Car creact(String chrType){
        if ("�µ�".equals(chrType)){
            return  new Audi();
        }else if ("���ǵ�".equals(chrType)) {
            return  new Byd();
        }else {
            return  null;
        }
    }
}
