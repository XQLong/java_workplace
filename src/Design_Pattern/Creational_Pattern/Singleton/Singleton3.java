package Design_Pattern.Creational_Pattern.Singleton;

/**
 * @Author: xql
 * @Date: Created in 21:46 2019/7/11
 * 线程安全的懒汉式
 */
public class Singleton3 {
    private static Singleton3 uniqueSingleton3;
    private Singleton3(){};
    //使用synchronized关键字进行同步静态方法getUniqueSingleton3，从而保证线程安全
    public synchronized static Singleton3 getUniqueSingleton3(){
        if(uniqueSingleton3==null){
            uniqueSingleton3 = new Singleton3();
        }
        return uniqueSingleton3;
    }
}
