package Algorithms.SortMethod;

/**
 * Created by xql on 2019/5/11.
 * 常见排序算法汇总
 */
public class SortMethod {
    /*公共方法*******************************************************************************/
    //交换数组中的第i和第j位的值
    public Comparable[] swap(Comparable[] arr,int i,int j){
        if(i==j) return arr;
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    //选出数组中最小（大）的值,is为true返回极大值，为false返回极小值
    public int selectExtremeValue(int[] arr,boolean is){
        int len = arr.length;
        if(len==1) return arr[0];
        int extreme = arr[0];
        for (int i=1;i<len;i++){
            boolean b = (is&&(arr[i]>extreme))||((!is)&&(arr[i]<extreme));
            if(b) extreme = arr[i];
        }
        return extreme;
    }
    /****************************************************************************************/
    //选择排序
    public Comparable[] chooseSort(Comparable[] input) {
        for (int i=0;i<input.length;i++){
            Comparable temp =input[i];
            for (int j = i;j<input.length;j++){
                if(temp.compareTo(input[j])==1){      //从大到小
                // if(temp.compareTo(input[j])==-1){   //从小到大
                    temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
        return input;
    }
    //插入排序
    public Comparable[] insertSort(Comparable[] input) {
        for (int i=0;i<input.length;i++){
            int j1 = i-1;
            int j2 = i;
            while (j1>=0){
                //按从小到大排列
                if(input[j2].compareTo(input[j1])==1) break;
                input = swap(input,j2,j1);
                j1--;
                j2--;
            }
        }
        return input;
    }
    //希尔排序
    public Comparable[] shellSort(Comparable[] input) {
        //确定初始h值
        int N = input.length;
        int h = 1;
        while (h<N/3) h = 3*h + 1;
        while (h>0){
            for(int i=0;i<N;i++){
                for(int j = i;j-h>=0;j=j-h){
                    if(input[j-h].compareTo(input[j])==-1) break;
                    input = swap(input,j-h ,j);
                }
            }
            h = h/3;
        }
        return input;
    }
    //归并排序
    Comparable[] temp;
    public Comparable[] mergeSort(Comparable[] input) {
        int l = input.length;
        temp = new Comparable[l];
        binarySort(input,0,l-1);
        return temp;
    }
    public void binarySort(Comparable[] input,int head,int end) {
        if(end-head<1) return;
        binarySort(input,head,(head+end)/2);
        binarySort(input,(head+end)/2+1,end);
        merge(input,head,(head+end)/2,end);
    }
    public void merge(Comparable[] input,int head,int mid,int end) {
        if(head == end) return;
        int p1 = head, p2 = mid+1;
        for(int j=head;j<=end;j++){
            if(p1>mid) temp[j] = input[p2++];
            else if(p2>end) temp[j] = input[p1++];
            else if(input[p1].compareTo(input[p2])>-1) temp[j] = input[p2++];
            else temp[j] = input[p1++];
        }
        for (int i=head;i<=end;i++) input[i] = temp[i];
    }
    //从底至上的归并排序
    public Comparable[] bottom_up_mergeSort(Comparable[] input) {
        int l = input.length;
        temp = new Comparable[l];
        for(int i=0;i<l;i++) temp[i] = input[i];
        return bottom_up(input);
    }
    public Comparable[] bottom_up(Comparable[] input) {
        int l = input.length;
        int size = 2;
        while (size/2<=l){
            for (int i=0;i<l;i = i+size){
                if(i+size<=l){
                    merge(input,i,(2*i+size-1)/2,(i+size-1));
                }else {
                    merge(input,i,(2*i+size-1)/2,l-1);
                }
                for(int j=0;j<l;j++) input[j] = temp[j];
            }
            size *= 2;
        }
        return input;
    }
    //利用插入排序的思想进行洗牌
    public Comparable[] shuffle(Comparable[] input){
        int l = input.length;
        for(int i=0;i<l;i++){
            //在[0,i]之间随机产生一个整数
            int ind = (int)(Math.random()*(i+1));
            if(ind!=i) {
                input = swap(input,i,ind);
             }
        }
        return input;
    }
    //快速排序
    public Comparable[] quickSort(Comparable[] input){
        int l = input.length;
        temp = new Comparable[l];
        for(int i=0;i<l;i++) temp[i] = input[i];
        dividePatition(0,l-1);
        return temp;
    }
    public void dividePatition(int i,int j){
        if(i>=j) return;
        int mid = partition(i,j);
        dividePatition(i,mid-1);
        dividePatition(mid+1,j);
    }
    public int partition(int i,int j){
        int len = temp.length;
        if(i>=j||i<0||j>=len) return 0;
        Comparable a0 = temp[i];
        int l = i+1,r = j;
        while (r-l>= 0){
            while (temp[l].compareTo(a0)==-1&&l<=j) l++;
            while (temp[r].compareTo(a0)>-1&&r>i) r--;
            if(r-l<1){
                break;
            }else {
                temp = swap(temp,l,r);
                l++;
                r--;
            }
        }
        temp =swap(temp,i,r);
        return r;
    }

}
