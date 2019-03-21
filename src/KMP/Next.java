package KMP;

/**
 * Created by xql on 2018/9/19.
 * 求next矩阵
 */
public class Next {
    /**
     * 复杂的方法
     * @param args
     */
    /*public List<Integer> getPreTable(String model) {
           String modelStr = model;
           int modelSize = modelStr.length();
           //模字符串各个字符对应的最长相同相同前后缀列表
           List<Integer> lenList = new ArrayList<Integer>();
           int len = 0;
           for (int i = 1; i <= modelSize; i++) {
               String part = modelStr.substring(0, i);
               len = this.getPatLen(part);
               lenList.add(len);
           }
           //求next矩阵
           List<Integer> nextList = new ArrayList<Integer>();
           for (int j = 0; j < modelSize; j++) {
               if (j == 0) {
                   nextList.add(1);
                   break;
               } else {
                   //前面已匹配的长度减去该字符对应的最大相同前后缀长度
                   nextList.add(j - lenList.get(j - 1));
               }
           }
           return nextList;
       }

       public int getPatLen(String partStr) {
           String str = partStr;
           int num = str.length();
           int len = 0;
           if (num > 1) {
               for (int i = num - 1; i > 0; i--) {
                   String pre = str.substring(0, i);
                   String suf = str.substring(num - i, num);
                   if (pre.equals(suf)) {
                       len = i;
                       break;
                   }
               }
           }
           return len;
       }*/
    public static void main(String[] args){
        String s = "adabc";
        KMPSolution kmpSolution = new KMPSolution();
        kmpSolution.getNext(s);
        /*int slen = s.length();
        int[] next =new int[slen];
        next[0] = 0;
        int ind = 0;//当前比较的位置
        int len = 0;
        for(int i = 1;i<slen;i++){
            while (s.charAt(i)!=s.charAt(ind)&&ind>0){
                ind = next[ind];
                len = 0;
            }
            if(s.charAt(i)==s.charAt(ind)){
                len += 1;
                next[i] = len;
            }else {
                next[i] = 0;
            }
            ind = next[i];
        }*/
    }
}
