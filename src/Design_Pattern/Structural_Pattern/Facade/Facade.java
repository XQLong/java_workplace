package Design_Pattern.Structural_Pattern.Facade;

/**
 * @Author: xql
 * @Date: Created in 20:11 2019/7/18
 * 外观模式外观类
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();
    public void watchMovie(){
        subSystem.turnOnTV();
        subSystem.setCD("Games of Thrones");
        subSystem.startWatching();
    }
}
