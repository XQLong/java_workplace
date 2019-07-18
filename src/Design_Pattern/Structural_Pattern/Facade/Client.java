package Design_Pattern.Structural_Pattern.Facade;

/**
 * @Author: xql
 * @Date: Created in 20:20 2019/7/18
 * 外观模式客户端类
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
