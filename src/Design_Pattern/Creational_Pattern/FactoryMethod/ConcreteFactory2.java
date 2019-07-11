package Design_Pattern.Creational_Pattern.FactoryMethod;

import Design_Pattern.Implements.ConcreteProduct2;
import Design_Pattern.Interface.Product;

/**
 * @Author: xql
 * @Date: Created in 20:38 2019/7/10
 * 工厂方法模式中的具体工厂类
 */
public class ConcreteFactory2 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
