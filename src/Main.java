import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);list.add(5);list.add(3);
            Collections.sort(list);
            list.add(2);
            Collections.reverse(list);
            System.out.println(list);
    }
}