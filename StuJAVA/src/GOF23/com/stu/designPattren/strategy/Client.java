package GOF23.com.stu.designPattren.strategy;
/**
 *
 *
 *          场景 ：
 *
 *                 某个市场人员接到单后的报价策略（CRM系统中常见问题） 报价简单分类
 *
 *                 - 普通客户小批量报价
 *                 - 普通客户大批量报价
 *                 - 老客户小批量报价
 *                 - 老客户大批量报价
 *
 *
 * */
public class Client {

    public static void main(String[] args) {
        /**
         *      使用策略模式
         * */

        AbstractStrategy strategy1 = new NewCustomreFweStrategy();
        AbstractStrategy strategy2 = new OldCustomreManyStrategy();
        Context context = new Context(strategy1);
            context.printPirce(2644.56);
            context.setStrategy(strategy2);
            context.printPirce(2644.56);
            System.out.println("---------------------------------------------------------------");

/**
 *  普通条件实现
 *      实现起来容易 但是违背了开闭原则
 *          加入类型特别多算法比较复杂时增加新类型时 算法会变得特别长不利于维护
 * */
    double price1 = 0.0;
    price1 = getPrice("老客户大批量",2564.2);
    System.out.println(price1);


    }




    private static double getPrice(String type ,double price) {

        if ("普通客户小批量".equals(type)){
            System.out.println("普通客户小批量 不打折");
            return price;

        }else if("普通客户大批量".equals(type)){

            System.out.println("普通客户大批量 打9折");
            return price * 0.9;

        }else if("老客户小批量".equals(type)){

            System.out.println("老客户大批量 打8.5折");
            return price * 0.85;

        }else if("老客户大批量".equals(type)){

            System.out.println("老客户大批量 打8折");
            return price * 0.8;
        }
        System.out.println("未找到客户类型不打折");
        return price;
    }
}
