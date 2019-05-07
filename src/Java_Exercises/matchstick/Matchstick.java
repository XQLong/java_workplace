package Java_Exercises.matchstick;

/**
 * Created by xql on 2019/2/26.
 */
public class Matchstick {
    int sum = 0;
    public boolean dfs(int[] nums,int index) {
        //for (int i=0;i<nums.length;i++) {
            sum += nums[index];
            System.out.println(nums[index] + "  " + sum);
            if (sum > 12) {
                sum -= nums[index];
                dfs(nums, index + 1);
            }
            if (sum == 12) return true;
            else {
                dfs(nums, index + 1);
            }
        //}
        return false;
    }
    public static void main(String[] args){
        Matchstick matchstick = new Matchstick();
        int[] test = {5,5,5,5,4,4,4,4,3,3,3,3};
        matchstick.dfs(test,0);
    }
}
