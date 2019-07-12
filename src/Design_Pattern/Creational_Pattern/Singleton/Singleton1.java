package Design_Pattern.Creational_Pattern.Singleton;

/**
 * @Author: xql
 * @Date: Created in 20:50 2019/7/11
 * 单例模式
 */
public class Singleton1 {
    //懒汉式
    private static Singleton1 uniqueInstance;
    private Singleton1(){}
    public static Singleton1 getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance  = new Singleton1();
        }
        return uniqueInstance;
    }
}
