package Design_Pattern.Structural_Pattern.Proxy.DynamicProxy;

/**
 * @Author: xql
 * @Date: Created in 16:13 2019/7/19
 */
public class Vendor implements Sell{
    @Override
    public void sell() {
        System.out.println("In sell method");
    }
    @Override
    public void ad() {
        System.out.println("ad method");
    }
}
