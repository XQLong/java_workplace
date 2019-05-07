package Java_Exercises.KMP;

import java.io.*;
import java.util.*;

public class KMPSolution {


    public int[] getNext(String pattern) {
        int i = 0;
        int j = -1;
        int[] next = new int[pattern.length() + 1];//next数组长度比pattern多1位
        next[0] = -1;

        while (i < pattern.length()) {
            if (j == -1 || pattern.charAt(i) == pattern.charAt(j)) {
                next[++i] = ++j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

    public int sameSnippet(String pattern,String source) {

        int i = 0;
        int j = 0;
        int[] next = getNext(pattern);
        int count = 0;
        while (i < source.length()) {
            if (j == -1 || source.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }

            if (j >= pattern.length()) {
                count++;
                j = next[j];//回溯
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        KMPSolution h = new KMPSolution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(br.readLine());
        int i = 0;
        List<Integer> counts = new ArrayList<Integer>(arrSize);
        while(i<arrSize){
            String pattern = br.readLine();
            String source = br.readLine();
            counts.add(h.sameSnippet(pattern,source));
            i++;
        }

        for(int c : counts){
            System.out.println(c);
        }
    }
}