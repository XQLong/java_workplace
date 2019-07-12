package Design_Pattern.Creational_Pattern.Singleton;

/**
 * @Author: xql
 * @Date: Created in 21:53 2019/7/11
 * 双重校验锁保证线程安全
 */
public class Singleton4 {
    //使用volatile关键字禁止JVM指令重排
    private volatile static Singleton4 uniqueSingleton4;
    private Singleton4(){};
    public static Singleton4 getUniqueSingleton4(){
        if(uniqueSingleton4==null){
            //双重校验同步
            synchronized (Singleton4.class){
                if(uniqueSingleton4==null){
                    uniqueSingleton4 = new Singleton4();
                }
            }
        }
        return uniqueSingleton4;
    }
}
