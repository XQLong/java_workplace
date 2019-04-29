package Sword2Offer.BinarySearchTreePostTraversal_33;

/**
 * Created by xql on 2019/4/28.
 */

public class SearchTreePostTraversal {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;
        int last = sequence.length - 1;
        int first = 0;
        return verifyBST(sequence,first,last);
    }
    public boolean verifyBST(int [] sequence,int first,int last){
        int cur = first;
        if(cur<0||last<0) return true;
        int root = sequence[last];
        while (last-cur>=1){
            if(root==sequence[cur]) return false;
            if(root<sequence[cur]) break;
            cur++;
        }
        if (last-cur<=1) return true;
        for (int i=cur;i<last;i++){
            if(sequence[i]<root) return false;
        }
        return verifyBST(sequence,first,cur-1)&&verifyBST(sequence,cur,last-1);
    }
}
