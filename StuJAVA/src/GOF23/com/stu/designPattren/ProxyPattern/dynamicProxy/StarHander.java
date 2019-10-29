package GOF23.com.stu.designPattren.ProxyPattern.dynamicProxy;

import GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern.RealStar;
import GOF23.com.stu.designPattren.ProxyPattern.staticProxyPrttern.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * java.lang.reflect.InvocationHandler  处理器接口
 *      可以通过invoke函数实现真实角色的代理访问
 *      可以通过Proxy生成代理类对象对象是都要指定对应的处理器对象
 *
 * java.lang.reflect.Proxy; 动态生成代理类对象
 *
 *
 *   JDK 自带的动态代理
 *     javaassist 字节码操作实现
 *     CGLIB
 *     ASM（底层使用指令 可维护性差）
 * */


public class StarHander implements InvocationHandler {
    Star star;

    public StarHander(Star star) {
        this.star = star;
    }
/**
 *
 * 当代理类执行被代理类函数是会执行invoke  可以在中间增加自己的操作得到想要的结果
 *
 * 被代理类   函数     函数参数
 *
 */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke 函数调用次数测试....");
        Object object = null;
        //可以在执行函数之前添加操作
            if ("sing".equals(method.getName())){
                star.confer();
                star.bookTicket();
                star.signContract();
                object =  method.invoke(star,args);
                star.collectMoney();
            }
        //也可以在执行函数之后添加操作
        return object;
    }


   public static void doTest() {
        Star star = new RealStar();
        StarHander hander = new StarHander(star);
        //获取代理类对象
                    // 类加载器   类接口类类型  hander  返回一个代理类
        Star realStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},hander);
        realStar.confer();
        realStar.sing();
    }
}
