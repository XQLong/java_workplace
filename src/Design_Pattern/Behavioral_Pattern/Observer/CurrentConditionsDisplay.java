package Design_Pattern.Behavioral_Pattern.Observer;

/**
 * @Author: xql
 * @Date: Created in 19:27 2019/7/20
 * 观察者模式具体观察者类
 */
public class CurrentConditionsDisplay implements Observer{
    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
