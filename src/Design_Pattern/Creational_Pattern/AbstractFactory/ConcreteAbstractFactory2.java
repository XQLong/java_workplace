package Design_Pattern.Creational_Pattern.AbstractFactory;

import Design_Pattern.Implements.ConcreteProductA2;
import Design_Pattern.Implements.ConcreteProductB2;
import Design_Pattern.Interface.ProductA;
import Design_Pattern.Interface.ProductB;

/**
 * @Author: xql
 * @Date: Created in 11:03 2019/7/11
 */
public class ConcreteAbstractFactory2 extends AbstractFactory{
    @Override
    ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
