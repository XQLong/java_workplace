package Design_Pattern.Creational_Pattern.BuilderPattern;

/**
 * @Author: xql
 * @Date: Created in 17:21 2019/7/11
 * 建造者模式的具体建造者类
 */
public class ConcreteBuilderA extends Builder{
    private Meal meal = new Meal();
    @Override
    void createFood() {
        meal.setFood("hamburger");
    }
    @Override
    void createDrink() {
        meal.setDrink("Coco cola");
    }
    @Override
    Meal getMeal() {
        return meal;
    }
}
