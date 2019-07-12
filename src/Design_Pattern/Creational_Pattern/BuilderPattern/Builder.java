package Design_Pattern.Creational_Pattern.BuilderPattern;

/**
 * @Author: xql
 * @Date: Created in 17:14 2019/7/11
 * 建造者模式抽象建造者类
 */
abstract public class Builder {
    abstract void createFood();
    abstract void createDrink();
    abstract Meal getMeal();
}
