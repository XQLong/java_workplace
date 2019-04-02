package Sword2Offer.integer_power_16;

/**
 * Created by xql on 2019/4/2.
 */
public class IntegerPower {
    public double Power(double base, int exponent) {
        if(base==0.00) return base;
        double res = exponent>0.00?base:1/base;
        int e = Math.abs(exponent);
        if(e==0) return 1.0;
        for (int i=1;i<e;i++){
            if(exponent>0.00){
                res=res*base;
            }else {
                res=(res)*1/base;
            }
        }
        return res;
    }
}
