package Sword2Offer.UglyNumber_49;

public class UglyNumber {
    public int GetUglyNumber_Solution(int N) {
        if(N<=6) return N;
        int[] ugn = new int[N];
        ugn[0] = 1;
        int ind2 = 0, ind3 = 0, ind5 = 0;
        for(int i = 1;i<N;i++){
            int next = Math.min(2*ugn[ind2],Math.min(3*ugn[ind3],5*ugn[ind5]));
            ugn[i] = next;
            if(next == 2*ugn[ind2]) ind2++;
            if(next == 3*ugn[ind3]) ind3++;
            if(next == 5*ugn[ind5]) ind5++;
        }
        return ugn[N-1];
    }
}
