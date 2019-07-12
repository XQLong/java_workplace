package Design_Pattern.Creational_Pattern.Singleton;

/**
 * @Author: xql
 * @Date: Created in 21:33 2019/7/11
 */
public class Singleton2 {
    //饿汉式
    private static Singleton2 uniqueInstance = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getUniqueInstance(){
        return uniqueInstance;
    }
    public void testPrint(){
        System.out.println("ok");
    }
}
