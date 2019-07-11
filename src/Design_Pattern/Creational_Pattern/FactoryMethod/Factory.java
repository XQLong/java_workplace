package Design_Pattern.Creational_Pattern.FactoryMethod;

import Design_Pattern.Interface.Product;

/**
 * @Author: xql
 * @Date: Created in 20:25 2019/7/10
 * 工厂方法模式中的抽象工厂类
 */
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething(){
        Product product = factoryMethod();
        //do something with the product
    }
}
