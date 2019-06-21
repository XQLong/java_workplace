package Sword2Offer.PresentMaxValue_47;

public class PresentMaxValue {
    public int getMost(int[][] board) {
        int x = board[0].length;
        int y = board.length;
        if(x<1||y<1) return 0;
        int v0 = board[0][0];
        int left = 0, up = 0;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                left = j>0?board[i][j-1]:0;     //(j,i)左边的点
                up = i>0?board[i-1][j]:0;       //(j,i)上面的点
                board[i][j] += Math.max(left,up);
            }
        }
        return board[y-1][x-1];
    }
}
