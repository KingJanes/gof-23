package GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern;
/**
 *
 *      静态代理演示：
 *                  模拟请某个明星唱歌
 *
 *
 *   代理公共接口
 *       代理人与明星的交谈步骤
 *
 *           confer    //面谈
 *           signContract //签合同
 *           bookTicket //订票
 *           sing   //唱歌
 *           collectMoney //付尾款
 *
 *
 */


public interface Star {

     void confer ();
     void signContract();
     void bookTicket();
     void sing();
     void collectMoney();
}
