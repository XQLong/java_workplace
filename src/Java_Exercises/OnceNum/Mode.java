package Java_Exercises.OnceNum;

import java.util.Arrays;

/**
 * Created by xql on 2019/2/28.
 */
public class Mode {
    public int majorityElement(int[] nums) {
        int m = nums.length/2;
        Arrays.sort(nums);
        if(nums[m-1]==nums[m]){
            return nums[m-1];
        }else {
            return nums[m+1];
        }
    }
}
