package Design_Pattern.Creational_Pattern;

import Design_Pattern.Implements.ConcreteProduct1;
import Design_Pattern.Interface.Product;

/**
 * @Author: xql
 * @Date: Created in 20:26 2019/7/10
 * 工厂方法类中的具体工厂类
 */
public class ConcreteFactory1 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
