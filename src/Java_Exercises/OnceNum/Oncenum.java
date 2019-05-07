package Java_Exercises.OnceNum;

/**
 * Created by xql on 2019/2/27.
 */
//任何数字与其本身异或运算为0，与0异或为其本身
public class Oncenum {
    public static void main(String args[]){
        int[] arr = {1,2,2};
        int res = 0;
        for(int i:arr){
            res = res^i;
        }
        System.out.println(res);
    }
}
