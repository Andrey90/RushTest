package shildt.book.exampleResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by luchk on 20.03.2016.
 */
class LRBDemo {
    public static void main(String args[]) {
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB", Locale.ENGLISH);

        System.out.println("English version: ");
        System.out.println("String for Title key : " +  rd.getString("title"));
        System.out.println("String for StopText key: " +  rd.getString("StopText"));
        System.out.println("String for StartText key: " +  rd.getString("StartText"));

        rd = ResourceBundle.getBundle("SampleRB_de", Locale.GERMAN);
        System.out.println("\nGerman version: ");
        System.out.println("String for Title key : " +  rd.getString("title"));
        System.out.println("String for StopText key: " +  rd.getString("StopText"));
        System.out.println("String for StartText key: " +  rd.getString("StartText"));
    }
}
