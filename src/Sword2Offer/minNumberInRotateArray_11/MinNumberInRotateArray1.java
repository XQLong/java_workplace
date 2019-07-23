package Sword2Offer.minNumberInRotateArray_11;

/**
 * @Author: xql
 * @Date: Created in 21:41 2019/7/23
 */
public class MinNumberInRotateArray1 {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len==0) return 0;
        return binarySearch(array,0,len-1);
    }
    public int binarySearch(int[] arr,int l,int r){
        if(r-l==1) return arr[l]<arr[r]?arr[l]:arr[r];
        int mid = (l+r)/2;
        if(arr[l]<arr[r]) return arr[l];
        else if(arr[l]>arr[r]) {
            if(arr[l]>arr[mid]){
                return binarySearch(arr,l,mid);
            }else{
                return binarySearch(arr,mid,r);
            }
        }
        else return Search(arr,l,r);
    }
    public int Search(int[] arr,int l,int r){
        int res = arr[l];
        for(int i=l;i<=r;i++){
            if(arr[i]<res) res = arr[i];
        }
        return res;
    }
}
