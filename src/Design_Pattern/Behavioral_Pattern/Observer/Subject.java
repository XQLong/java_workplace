package Design_Pattern.Behavioral_Pattern.Observer;

/**
 * @Author: xql
 * @Date: Created in 19:17 2019/7/20
 * 观察者模式目标类
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
