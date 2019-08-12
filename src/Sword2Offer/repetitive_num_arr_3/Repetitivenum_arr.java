package Sword2Offer.repetitive_num_arr_3;

/**
 * Created by xql on 2019/3/21.
 */
public class Repetitivenum_arr {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i=0;i<length;i++){
            if(numbers[i]<i){
                duplication[0] = numbers[i];
                return true;
            }
            while(i!=numbers[i]){
                if(numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers,i,numbers[i]);
            }
        }
        return false;
    }
    public void swap(int arr[],int l,int r){
        if(l==r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
