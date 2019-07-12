package Design_Pattern.Creational_Pattern.BuilderPattern;

/**
 * @Author: xql
 * @Date: Created in 17:27 2019/7/11
 * 建造者模式具体建造者类
 */
public class ConcreteBuilderB extends Builder{
    private Meal meal = new Meal();
    @Override
    void createFood() {
        meal.setFood("french fries");
    }

    @Override
    void createDrink() {
        meal.setDrink("Pepsi cola");
    }

    @Override
    Meal getMeal() {
        return meal;
    }
}
