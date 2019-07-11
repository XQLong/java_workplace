package Design_Pattern;

import Design_Pattern.Creational_Pattern.ConcreteFactory1;
import Design_Pattern.Creational_Pattern.Factory;
import Design_Pattern.Creational_Pattern.SimpleFactory;
import Design_Pattern.Interface.Product;

/**
 * @Author: xql
 * @Date: Created in 17:47 2019/7/10
 */
public class Client {
    public static void main(String[] args){

        /*使用简单工厂模式创建对象*/
        SimpleFactory sf = new SimpleFactory();
        Product product = sf.createProduct(1);
        //use product of type 1

        /*使用工厂方法模式*/
        Factory factory1 = new ConcreteFactory1();
        factory1.doSomething();
    }
}
