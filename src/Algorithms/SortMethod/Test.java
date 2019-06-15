package Algorithms.SortMethod;

/**
 * Created by xql on 2019/5/13.
 */
public class Test {
    public static void main(String[] args) {
        Comparable[] input = new Comparable[]{5, 4,6, 2, 1,7, 8, 3,5,9,12,8,0,2,5,7,2,1,4,8,1,78};
        SortMethod test = new SortMethod();
//        Comparable[] arr1 = test.chooseSort(input);
//        Comparable[] arr2 = test.insertSort(input);
//        Comparable[] arr3 = test.shellSort(input);
//        Comparable[] arr4 = test.mergeSort(input);
//        Comparable[] arr5 = test.bottom_up_mergeSort(input);
          Comparable[] arr6 = test.quickSort(input);
    }
}
