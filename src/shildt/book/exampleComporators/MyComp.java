package shildt.book.exampleComporators;

import java.util.Comparator;

/**
 * Created by luchkovsky on 24.11.2015.
 */
public class MyComp implements Comparator<String> {
    public int compare(String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;

        return bStr.compareTo(aStr);
    }
}
