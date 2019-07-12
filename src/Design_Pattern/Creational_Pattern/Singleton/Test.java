package Design_Pattern.Creational_Pattern.Singleton;

/**
 * @Author: xql
 * @Date: Created in 21:37 2019/7/11
 */
public class Test {
    public static void main(String[] args){
        Singleton2 singleton2 = Singleton2.getUniqueInstance();
        singleton2.testPrint();
    }
}
