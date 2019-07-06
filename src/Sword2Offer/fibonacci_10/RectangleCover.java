package Sword2Offer.fibonacci_10;

/**
 * @Author: xql
 * @Date: Created in 16:28 2019/7/6
 */
public class RectangleCover {
    public int RectCover(int target) {
        if(target<=2) return target;
        int[] arr = new int[target];
        arr[0] = 1; arr[1] = 2;
        for(int i=2;i<target;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[target-1];
    }
}
