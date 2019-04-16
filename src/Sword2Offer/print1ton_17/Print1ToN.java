package Sword2Offer.print1ton_17;

/**
 * Created by xql on 2019/4/11.
 */
public class Print1ToN {
    public  void  print1ToN(int N){
        char[] n_arr = new char[N];
        createNum(n_arr,0);
    }

    //采用回溯法
    public void createNum(char[] arr,int p){
        //定义字符数组保存数字
        char[] num = arr;
        int len = num.length;
        if(p==len-1){
            printN(num);
            return;
        }
        for (int i=0;i<10;i++){
            num[p] = (char)('0'+i);
            createNum(num,p+1);
        }
    }

    public void printN(char[] arr){
        int ind = 0;
        int l = arr.length;
        for (int i=0;i<l;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
