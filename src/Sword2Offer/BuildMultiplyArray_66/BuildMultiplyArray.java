package Sword2Offer.BuildMultiplyArray_66;

/**
 * @Author: xql
 * @Date: Created in 18:57 2019/7/5
 */
public class BuildMultiplyArray {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int multiplyleft = 1,multiplyright = 1;
        res[0] = 1;
        for(int i=1;i<len;i++){
            multiplyleft *= A[i-1];
            res[i] = multiplyleft;
        }
        for(int j=len-2;j>=0;j--){
            multiplyright *= A[j+1];
            res[j] *= multiplyright;
        }
        return res;
    }
}
