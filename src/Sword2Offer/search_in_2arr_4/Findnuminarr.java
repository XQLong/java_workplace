package Sword2Offer.search_in_2arr_4;

/**
 * Created by xql on 2019/3/22.
 */
public class Findnuminarr {
    public boolean findnum(int target,int[][] arr){
        int x = 0;
        int y = arr[0].length - 1; //二维矩阵列数
        int xl =  arr.length - 1;  //二维矩阵让行数
        //System.out.println("而维矩阵的行数："+xl+"二维矩阵的列数："+y);
        //要比较的值
        int compare = arr[x][y];
        while (x<=xl&&y>=0){
            compare = arr[x][y];
            if(compare<target){
                x += 1;
            }else if(compare==target){
                return true;
            }else {
                y -= 1;
            }
        }
        return false;
    }
}
