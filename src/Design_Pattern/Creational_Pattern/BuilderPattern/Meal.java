package Design_Pattern.Creational_Pattern.BuilderPattern;

/**
 * @Author: xql
 * @Date: Created in 17:11 2019/7/11
 * 建造者模式创建产品类（套餐）
 */
public class Meal {
    //套餐内包含食物和饮料
    private String food;
    private String drink;
    public void setFood(String food) {
        this.food = food;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getFood() {
        return food;
    }
    public String getDrink() {
        return drink;
    }
}
