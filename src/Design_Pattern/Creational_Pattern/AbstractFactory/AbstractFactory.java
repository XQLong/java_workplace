package Design_Pattern.Creational_Pattern.AbstractFactory;

import Design_Pattern.Interface.Product;
import Design_Pattern.Interface.ProductA;
import Design_Pattern.Interface.ProductB;

/**
 * @Author: xql
 * @Date: Created in 10:51 2019/7/11
 * 抽象工厂方法的抽象工厂类
 */
abstract public class AbstractFactory {
    abstract ProductA createProductA();
    abstract ProductB createProductB();
    public void doSomethingWithA(){
        ProductA productA = createProductA();
        //do something with ProductA
    }
    public void doSomethingWithB(){
        ProductB productB = createProductB();
        //do something with ProductB
    }
}
