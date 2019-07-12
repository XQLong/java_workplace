package Design_Pattern.Structural_Pattern.Adapter;

/**
 * @Author: xql
 * @Date: Created in 10:39 2019/7/12
 * 适配器模式目标类
 */
public interface Target {
    /*源类Adaptee中有的方法*/
    public void sampleOperation1();

    /*源类Adaptee中没有的方法*/
    public void sampleOperation2();
}
