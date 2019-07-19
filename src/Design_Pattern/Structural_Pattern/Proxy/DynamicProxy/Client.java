package Design_Pattern.Structural_Pattern.Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author: xql
 * @Date: Created in 16:22 2019/7/19
 * 动态代理模式测试客户端类
 */
public class Client {
    public static void main(String[] args) {
        Handler handler = new Handler(new Vendor());
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //获取代理类实例
        Sell sell = (Sell)(Proxy.newProxyInstance(Sell.class.getClassLoader(),new Class[] {Sell.class}, handler));
        sell.sell();
        sell.ad();
    }
}
