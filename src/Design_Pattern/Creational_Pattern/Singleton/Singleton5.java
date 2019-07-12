package Design_Pattern.Creational_Pattern.Singleton;

/**
 * @Author: xql
 * @Date: Created in 22:06 2019/7/11
 */
public class Singleton5 {
    private Singleton5(){}
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    public static Singleton5 getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}
