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
        for(int i=0;i<l;i++) temp[i] = input[i];
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
        for (int i=0;i<input.length;i++) input[i] = temp[i];
        int p1 = head, p2 = mid+1;
        for(int j=head;j<=end;j++){
            if(p1>mid) temp[j] = input[p2++];
            else if(p2>end) temp[j] = input[p1++];
            else if(input[p1].compareTo(input[p2])>-1) temp[j] = input[p2++];
            else temp[j] = input[p1++];
        }
    }
}
