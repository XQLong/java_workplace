package Sword2Offer.NumberOfStringIndex_44;

public class DightAtStringIndex {
    public int getDigitAtIndex(int index) {
        int res = 0;
        int[] arr = getLeftBorder(index);
        int cnt = arr[0],border = arr[1];
        //确定index位置的字符是第多少个cnt位数
        int s = (index-border)/cnt;
        int y = (index-border)%cnt;
        int bottom = (int)Math.pow(10,cnt-1);
        int number = y==0?bottom+s-1:bottom+s;
        char[] chars = Integer.valueOf(number).toString().toCharArray();
        //根据余数确定index位为number的第几位
        char r = y==0?chars[cnt-1]:chars[y-1];
        res = Integer.valueOf(String.valueOf(r));
        return res;
    }
    //确定第index位数字所在的整数的位数及具有该位数整数的左边界
    public int[] getLeftBorder(int index){
        if(index<=9) return new int[]{1,0};
        int[] res = new int[2];
        int cnt = 1;
        int LeftBorder = 9;
        int bits = 10;  //初始位数为2位
        while ((LeftBorder + 9*(cnt+1)*bits)<index){
            LeftBorder += 9*(cnt+1)*bits;
            bits *= 10;
            cnt++;
        }
        res[0] = cnt+1;
        res[1] = LeftBorder;
        return res;
    }
}
