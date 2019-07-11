package Design_Pattern.Creational_Pattern.SimpleFactory;

import Design_Pattern.Implements.ConcreteProduct1;
import Design_Pattern.Implements.ConcreteProduct2;
import Design_Pattern.Implements.ConcreteProduct3;
import Design_Pattern.Interface.Product;

/**
 * @Author: xql
 * @Date: Created in 17:36 2019/7/10
 * 简单工厂模式的工厂类
 */
public class SimpleFactory {
    public Product createProduct(int type){
        if(type==1){
            return new ConcreteProduct1();
        }else if(type==1){
            return new ConcreteProduct2();
        }else {
            return new ConcreteProduct3();
        }
    }
}
