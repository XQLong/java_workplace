package Sword2Offer.robotmoverange_13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xql on 2019/3/31.
 */
public class RobotMoveRange {
    public int movingCount(int threshold, int rows, int cols)
    {
        List<Integer> path = new ArrayList<Integer>();
        nextpoint(threshold,rows,cols,0,0,path);
        System.out.println(path);
        return path.size();
    }
    public boolean nextpoint(int threshold,int rows,int cols,int r, int c,List<Integer> path)
    {
        String str1 = String.valueOf(r);
        String str2 = String.valueOf(c);
        int t = 0;
        for (int i=0;i< str1.length();i++) t += Integer.valueOf(str1.substring(i,i+1));
        for (int i=0;i< str2.length();i++) t += Integer.valueOf(str2.substring(i,i+1));
        int number = r*cols + c;
        if(t>threshold){
            return false;
        }
        path.add(Integer.valueOf(number));
        //左
        return  (c<cols && c>0)&& !path.contains(number-1) && nextpoint(threshold,rows,cols,r,c-1,path)
        //右
        ||(c>=0 && c<cols-1) && !path.contains(number+1) && nextpoint(threshold,rows,cols,r,c+1,path)
        //上
        ||(r<rows && r>0) && !path.contains(number-cols) && nextpoint(threshold,rows,cols,r-1,c,path)
        //下
        ||(r>=0&&r<rows-1) && !path.contains(number+cols) && nextpoint(threshold,rows,cols,r+1,c,path);
    }
}
