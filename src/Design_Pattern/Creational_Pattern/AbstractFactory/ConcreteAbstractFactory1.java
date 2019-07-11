package Design_Pattern.Creational_Pattern.AbstractFactory;

import Design_Pattern.Implements.ConcreteProductA1;
import Design_Pattern.Implements.ConcreteProductB1;
import Design_Pattern.Interface.ProductA;
import Design_Pattern.Interface.ProductB;

/**
 * @Author: xql
 * @Date: Created in 11:02 2019/7/11
 */
public class ConcreteAbstractFactory1 extends AbstractFactory{
    @Override
    ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
