package Sword2Offer.repetitive_num_arr_3;

/**
 * Created by xql on 2019/3/21.
 */
public class Repetitivenum_arr {
    public int searchnum(int[] arr){
        for(int i = 0;i<arr.length;i++){
            while(i!=arr[i]){
                swapnum(arr,i,arr[i]);
                for (int a:arr){
                    System.out.print(a);
                }
                System.out.println(" ");
                if(arr[i]==arr[arr[i]]){
                    System.out.println("res:"+arr[i]);
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public int[] swapnum(int[] arr,int i,int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[j]^arr[i];
        arr[i] = arr[i]^arr[j];
        return arr;
    }
}
