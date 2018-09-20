package KMP;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/18.
 */
public class Match {
    public static void main(String[] args){
        String model = "babab";
        PrefixArray prefixArray = new PrefixArray();
        //部分匹配表（partial match table）
        List<Integer> pmt = prefixArray.getPrefixArray(model);
        System.out.println(pmt);
        prefixArray.matchPart("bababababababababb",model,pmt);
    }
}
