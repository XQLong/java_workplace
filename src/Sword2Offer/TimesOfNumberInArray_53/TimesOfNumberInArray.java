package Sword2Offer.TimesOfNumberInArray_53;

public class TimesOfNumberInArray {
    int cnt = 0;
    public int GetNumberOfK(int [] array , int k) {
        binarySearch(array,0,array.length-1,k);
        return cnt;
    }
    public void binarySearch(int[] input,int l,int r,int k){
        int len = input.length;
        if(r>=len||l<0||l>r) return;
        if(input[l]>k||input[r]<k) return;
        while (input[l]==k){
            cnt++;
            if(l==r) return;
            l++;
        }
        while (input[r]==k){
            cnt++;
            if(l==r) return;
            r--;
        }
        int mid = (r+l)/2;
        binarySearch(input,l,mid,k);
        binarySearch(input,mid+1,r,k);
    }

    public int GetNumberOfK1(int [] array , int k){
        int cnt = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]==k) cnt++;
            if(array[i]>k) break;
        }
        return cnt;
    }
}
