package shildt.book.exampleComporators;

import java.util.Comparator;

/**
 * Created by luchkovsky on 24.11.2015.
 */
public class TComp implements Comparator<String> {
    public int compare(String a, String b){
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;

        //To find the index of symbol in the row, which start Surname
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if (k == 0){
            return aStr.compareTo(bStr);
        }else{
            return k;
        }
    }
}
