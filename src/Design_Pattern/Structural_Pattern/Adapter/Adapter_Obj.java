package Design_Pattern.Structural_Pattern.Adapter;

/**
 * @Author: xql
 * @Date: Created in 11:17 2019/7/12
 * 适配器模式中的适配器类（对象适配器模式）
 */
public class Adapter_Obj implements Target{
    private Adaptee adaptee;
    public Adapter_Obj(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    //源类Adaptee有方法sampleOperation1,因此适配器类直接委派即可
    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {

    }
}
