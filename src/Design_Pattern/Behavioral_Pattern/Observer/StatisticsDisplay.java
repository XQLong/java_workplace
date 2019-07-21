package Design_Pattern.Behavioral_Pattern.Observer;

import org.omg.CORBA.Object;

/**
 * @Author: xql
 * @Date: Created in 19:25 2019/7/20
 * 观察者模式具体观察者类
 */
public class StatisticsDisplay implements Observer {
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
