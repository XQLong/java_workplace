package Design_Pattern.Structural_Pattern.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: xql
 * @Date: Created in 11:47 2019/7/19
 * 实现调用处理器接口实现动态代理
 */
public class Handler implements InvocationHandler {
    private Object obj;     //obj为委托类对象
    public Handler(Object o){
        this.obj = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }
}
