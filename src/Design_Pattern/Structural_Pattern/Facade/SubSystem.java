package Design_Pattern.Structural_Pattern.Facade;

/**
 * @Author: xql
 * @Date: Created in 20:09 2019/7/18
 * 外观模式子系统类
 */
public class SubSystem {
    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }
    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }
    public void startWatching(){
        System.out.println("startWatching()");
    }
}
