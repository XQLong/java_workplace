package Sword2Offer.PrintArrayClosewise_29;

import java.util.ArrayList;

/**
 * Created by xql on 2019/4/25.
 */
public class ArrayPrintClosewise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int lines = matrix.length;  //行数
        int rows = matrix[0].length;    //列数
        int xstart = 0,ystart = 0;
        int xborder=rows-1,yborder=lines-1;
        int x=0,y=0;    //起始点
        res.add(matrix[y][x]);
        System.out.println(x+"  "+y);
        while ((xstart<=xborder&&xborder>0)||(ystart<=yborder&&yborder>0)){
            while (y==ystart&&x<xborder){
                x++;
                res.add(matrix[y][x]);
                System.out.println(x+"  "+y);
            }
            while (x==xborder&&y<yborder){
                y++;
                res.add(matrix[y][x]);
                System.out.println(x+"  "+y);
            }
            if(xstart==xborder||ystart==yborder) break;
            while (y==yborder&&x>xstart){
                x--;
                res.add(matrix[y][x]);
                System.out.println(x+"  "+y);
            }
            while (x==xstart&&y>ystart+1){
                y--;
                res.add(matrix[y][x]);
                System.out.println(x+"  "+y);
            }
            xborder--;
            yborder--;
            xstart++;
            ystart++;
            if(xstart<=xborder||ystart<=yborder){
                x++;
                if(x>xborder||y>yborder) break;
                res.add(matrix[y][x]);
                System.out.println(x+"  "+y);
            }
        }
        return res;
    }
}
