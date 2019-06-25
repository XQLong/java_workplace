package Sword2Offer.ArrayInversePairs_51;

public class ArrayInversePairs {
    int tmp[];
    long cnt = 0;
    public int InversePairs(int [] array) {
        int len = array.length;
        long y = 1000000007L;
        mergeSort(array);
        //quickSort(array);
        return (int)(cnt%y);
    }
    //归并排序
    public void mergeSort(int[] input){
        int len = input.length;
        tmp = new int[len];
        binary(input,0,len-1);
    }
    public void binary(int[] input,int l,int r){
        if(l>=r) return;
        binary(input,l,(r+l)/2);
        binary(input,(r+l)/2+1 ,r);
        merge(input, l,(r+l)/2,r);
    }
    public void merge(int[] input , int start,int mid,int end){
        System.out.println(start+" "+end);
        int i = start , j = mid+1;
        for(int k=start;k<=end;k++){
            if(i>mid)  tmp[k] = input[j++];
            else if(j>end) tmp[k] = input[i++];
            else if(input[i]<=input[j]) tmp[k] = input[i++];
            else{
                tmp[k] = input[j++];
                this.cnt += mid-i+1;
            }
        }
        for (int m=start;m<=end;m++) input[m] = tmp[m];
    }

    //快速排序（快速排序不稳定，不便于逆序对的求取，此处不展开）
    public void quickSort(int[] input){
        int len = input.length;
        tmp = new int[len];
        for(int i=0;i<len;i++) tmp[i] = input[i];
        divide(0,len-1);
    }
    public void divide(int l,int r){
        if(l>=r) return;
        int m = partition(l,r);
        divide(l,m-1);
        divide(m+1,r);
    }
    public int partition(int l,int r){
        int l0 = l+1 ,r0 = r, a0 = tmp[l];
        while (l0<=r0){
            while (l0<=r && tmp[l0]<=a0){
                l0++;
            }
            while (r0>=l && tmp[r0]>a0){
                r0--;
            }
            if(l0<r0){
                tmp = swap(tmp,l0,r0);
                l0++;
                r0--;
            }
        }
        tmp = swap(tmp,l,r0);
        return r0;
    }
    public int[] swap(int[] input,int i,int j){
        if(i==j) return input;
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        return input;
    }
}
