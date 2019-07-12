package Design_Pattern.Creational_Pattern.BuilderPattern;

/**
 * @Author: xql
 * @Date: Created in 17:31 2019/7/11
 * 建造者模式中的指挥者类
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public Meal buildMeal(){
        builder.createFood();
        builder.createDrink();
        return builder.getMeal();
    }
}
